package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.giobo;

/**
 * Servlet implementation class xoacontroller
 */
@WebServlet("/xoacontroller")
public class xoacontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public xoacontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");

			HttpSession session = request.getSession();
			giobo g;
			String ms = request.getParameter("ms");
			if (ms != null) {
				g = (giobo) session.getAttribute("g");
				g.xoa(ms);
				session.setAttribute("g", g);
				if (session.getAttribute("g") == null)
					response.sendRedirect("skincarecontroller");
				else
					response.sendRedirect("giocontroller");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
