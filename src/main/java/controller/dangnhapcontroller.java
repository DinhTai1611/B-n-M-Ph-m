package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachhangbean;
import bo.khachhangbo;

/**
 * Servlet implementation class dangnhapcontroller
 */
@WebServlet("/dangnhapcontroller")
public class dangnhapcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public dangnhapcontroller() {
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
			String un = request.getParameter("txtun");
			String pass = request.getParameter("txtpass");

			if (un != null && pass != null) {
				khachhangbo khbo = new khachhangbo();
				khachhangbean kh = khbo.ktdn(un, pass);
				if (kh != null) {
					HttpSession session = request.getSession();
					session.setAttribute("un", un);
					session.setAttribute("pw", pass);
					session.setAttribute("dn", kh);
					response.sendRedirect("skincarecontroller");
				} else {
					response.sendRedirect("skincarecontroller");
				}
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
