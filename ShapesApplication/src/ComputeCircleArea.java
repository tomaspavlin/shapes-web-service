

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.jyu.pservice.ComputeAreaImpl;

/**
 * Servlet implementation class ComputeCircleArea
 */
@WebServlet("/ComputeCircleArea")
public class ComputeCircleArea extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComputeAreaImpl areaService;
	private Utility utility;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComputeCircleArea(ComputeAreaImpl areaService, Utility utility) {
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
        
        double radius = this.utility.getArgInMeters(request, "radius");
        double result = this.utility.parseResults(
    		request.getParameter("resultUnit"),
    		this.areaService.computeCircleArea(radius));
        
        PrintWriter out  = response.getWriter();
        out.print(result);
        out.flush();
	}

}
