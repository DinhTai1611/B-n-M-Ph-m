package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaibean;
import bean.skincarebean;
import bo.loaibo;
import bo.skincarebo;

/**
 * Servlet implementation class skincarecontroller
 */
@WebServlet("/skincarecontroller")
public class skincarecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public skincarecontroller() {
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

			loaibo lbo = new loaibo();
			ArrayList<loaibean> dsloai = lbo.getloai();

			skincarebo sbo = new skincarebo();
			ArrayList<skincarebean> dsskin = sbo.getskin();

			String ml = request.getParameter("ml");
			String key = request.getParameter("txttim");

			if (ml != null)
				dsskin = sbo.timma(ml);
			else if (key != null)
				dsskin = sbo.tim(key);

			request.setAttribute("dsloai", dsloai);
			request.setAttribute("dsskin", dsskin);

			RequestDispatcher rd = request.getRequestDispatcher("skincare.jsp");
			rd.forward(request, response);
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
