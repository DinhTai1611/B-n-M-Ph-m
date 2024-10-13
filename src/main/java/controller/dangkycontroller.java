package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.khachhangbo;

/**
 * Servlet implementation class dangkycontroller
 */
@WebServlet("/dangkycontroller")
public class dangkycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public dangkycontroller() {
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
			String tenkh = request.getParameter("tenkh");
			String diachi = request.getParameter("diachi");
			String sodt = request.getParameter("sodt");
			String email = request.getParameter("email");
			String tendn = request.getParameter("tendn");
			String pass = request.getParameter("pass");
			khachhangbo khbo = new khachhangbo();
			if (tenkh != null && diachi != null && sodt != null && email != null && tendn != null && pass != null) {
				khbo.themkh(tenkh, diachi, sodt, email, tendn, pass);
				response.sendRedirect("skincarecontroller");
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("dangky.jsp");
				rd.forward(request, response);
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
