

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.jyu.pservice.ComputeAreaImpl;

/**
 * Servlet implementation class ComputeSquareArea
 */
@WebServlet("/ComputeSquareArea")
public class ComputeSquareArea extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComputeAreaImpl areaService;
	private Utility utility;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComputeSquareArea(ComputeAreaImpl areaService, Utility utility) {
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
        
        Double side = null;
        try {
        	side = this.utility.getArgInMeters(request, "side");
        } catch (Exception e) {
        	response.setStatus(400);
        }
        
        PrintWriter out  = response.getWriter();
        
        if (side != null) {
        	Double result = this.utility.parseResults(
        		request.getParameter("resultUnit"),
        		this.areaService.computeSquareArea(side));
        	out.print(result);
        } else {
        	out.print("Wrong request parameters. Make sure that you use correct unit.");
        }

        out.flush();
	}

}
