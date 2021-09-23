package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Unsplash;

/**
 * Servlet implementation class getUnsplashServlet
 */
@WebServlet("/getUnsplashServlet")
public class getUnsplashServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getUnsplashServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String width    = request.getParameter("width");
        String height   = request.getParameter("height");
        String keywords = request.getParameter("keywords");
        
        Unsplash unsplash = new Unsplash(Integer.parseInt(width), Integer.parseInt(height), keywords);
        
        request.setAttribute("Unsplash", unsplash);
        
        getServletContext().getRequestDispatcher("/unsplashImage.jsp").forward(request, response);
	}

}
