import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.jyu.pservice.*;

/**
 * Servlet implementation class ComputeTriangleAreaByBaseAndHeight
 */
@WebServlet("/ComputeTriangleAreaByBaseAndHeight")
public class ComputeTriangleAreaByBaseAndHeight extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComputeAreaImpl areaService;
	private Utility utility;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComputeTriangleAreaByBaseAndHeight(ComputeAreaImpl areaService, Utility utility) {
        super();
        this.areaService = areaService;
        this.utility = utility;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        
        Double base = null;
        Double height = null;
        try {
        	base = this.utility.getArgInMeters(request, "base");
        	height = this.utility.getArgInMeters(request, "height");
        } catch (Exception e) {
        	response.setStatus(400);
        }
        
        PrintWriter out  = response.getWriter();
        
        if (base != null && height != null) {
        	Double result = this.utility.parseResults(
        		request.getParameter("resultUnit"),
        		this.areaService.computeTriangleAreaByBaseAndHeight(base, height));
        	out.print(result);
        } else {
        	out.print("Wrong request parameters. Make sure that you use correct unit.");
        }

        out.flush();
	}

}
