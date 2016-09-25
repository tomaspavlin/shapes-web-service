import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.servlet.*;

import fi.jyu.pservice.*;
import net.webservicex.area.*;
import net.webservicex.length.*;

public class Main {

	public static void main(String[] args) throws Exception {
		ServletHandler servletHandler = new ServletHandler();
		AreaUnitSoap areaUnitConverter = new AreaUnit().getAreaUnitSoap();
		LengthUnitSoap lengthUnitConverter = new LengthUnit().getLengthUnitSoap();
		Utility utility = new Utility(lengthUnitConverter, areaUnitConverter);
		ComputeAreaImpl areaService = new ComputeAreaImplService().getComputeAreaImplPort();
		// Example: "/ComputeTriangleAreaByBaseAndHeight?base=5.0&height=2.0&baseUnit=Meters&heightUnit=Meters&resultUnit=squaremeter"
		servletHandler.addServletWithMapping(
			new ServletHolder(new ComputeTriangleAreaByBaseAndHeight(areaService, utility)),
			"/ComputeTriangleAreaByBaseAndHeight");
		// Example: "/ComputeSquareArea?side=5.0&sideUnit=Meters&resultUnit=squaremeter"
		servletHandler.addServletWithMapping(
			new ServletHolder(new ComputeSquareArea(areaService, utility)),
			"/ComputeSquareArea");
		// Example: "/ComputeCircleArea?radius=5.0&radiusUnit=Meters&resultUnit=squaremeter"
		servletHandler.addServletWithMapping(
			new ServletHolder(new ComputeCircleArea(areaService, utility)),
			"/ComputeCircleArea");
		
		ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(true);
		resourceHandler.setWelcomeFiles(new String[]{ "index.html" });
		resourceHandler.setResourceBase("./WebContent");
		
		HandlerList handlers = new HandlerList();
	    handlers.setHandlers(new Handler[] { resourceHandler, servletHandler });
	    
		Server server = new Server(8081);
		server.setHandler(handlers);
		server.start();
		server.dumpStdErr();
		server.join();
	}

}
