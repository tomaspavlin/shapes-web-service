import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

import fi.jyu.pservice.*;
import net.webservicex.area.*;
import net.webservicex.length.*;

public class Main {

	public static void main(String[] args) throws Exception {
		ServletHandler handler = new ServletHandler();
		AreaUnitSoap areaUnitConverter = new AreaUnit().getAreaUnitSoap();
		LengthUnitSoap lengthUnitConverter = new LengthUnit().getLengthUnitSoap();
		Utility utility = new Utility(lengthUnitConverter, areaUnitConverter);
		ComputeAreaImpl areaService = new ComputeAreaImplService().getComputeAreaImplPort();
		// Example: "/ComputeTriangleAreaByBaseAndHeight?base=5.0&height=2.0&baseUnit=Meters&heightUnit=Meters&resultUnit=squaremeter"
		handler.addServletWithMapping(
			new ServletHolder(new ComputeTriangleAreaByBaseAndHeight(areaService, utility)),
			"/ComputeTriangleAreaByBaseAndHeight");
		// Example: "/ComputeSquareArea?side=5.0&sideUnit=Meters&resultUnit=squaremeter"
		handler.addServletWithMapping(
			new ServletHolder(new ComputeSquareArea(areaService, utility)),
			"/ComputeSquareArea");
		// Example: "/ComputeCircleArea?radius=5.0&radiusUnit=Meters&resultUnit=squaremeter"
		handler.addServletWithMapping(
			new ServletHolder(new ComputeCircleArea(areaService, utility)),
			"/ComputeCircleArea");
		Server server = new Server(8081);
		server.setHandler(handler);
		server.start();
		server.dumpStdErr();
		server.join();
	}

}
