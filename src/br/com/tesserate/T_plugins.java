package br.com.tesserate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/plugins"})
public class T_plugins extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -835800266579412031L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/t_plugins.jsp");
		dispatcher.forward(request, response);
	}
}
