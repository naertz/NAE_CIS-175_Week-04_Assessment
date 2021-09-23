package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Picsum;

/**
 * Servlet implementation class getPicsumServlet
 */
@WebServlet("/getPicsumServlet")
public class getPicsumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPicsumServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String width   = request.getParameter("width");
	    String height  = request.getParameter("height");
	    String seed    = request.getParameter("seed");
	    
	    Picsum picsum = new Picsum(Integer.parseInt(width), Integer.parseInt(height), seed);
	    
	    request.setAttribute("Picsum", picsum);
	    
	    getServletContext().getRequestDispatcher("/picsumImage.jsp").forward(request, response);
	}

}
