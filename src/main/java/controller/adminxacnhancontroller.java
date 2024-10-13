package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.chitietbo;

/**
 * Servlet implementation class adminxacnhancontroller
 */
@WebServlet("/adminxacnhancontroller")
public class adminxacnhancontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public adminxacnhancontroller() {
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
			String mact = request.getParameter("mact");
			chitietbo ctbo = new chitietbo();
			if (ctbo != null) {
				request.setAttribute("ds", ctbo.getxacnhan());
			}
			if (mact != null) {
				ctbo.sua(Long.parseLong(mact));
				response.sendRedirect("adminxacnhancontroller");
				return;
			}
			RequestDispatcher rd = request.getRequestDispatcher("adminxacnhan.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
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
