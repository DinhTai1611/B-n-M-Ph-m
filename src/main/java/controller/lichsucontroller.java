package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachhangbean;
import bean.lichsubean;
import bean.loaibean;
import bean.skincarebean;
import bo.lichsubo;
import bo.loaibo;
import bo.skincarebo;

/**
 * Servlet implementation class lichsucontroller
 */
@WebServlet("/lichsucontroller")
public class lichsucontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public lichsucontroller() {
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
			khachhangbean kh = (khachhangbean) session.getAttribute("dn");
			if (kh == null) {
				RequestDispatcher rd = request.getRequestDispatcher("dangnhap.jsp");
				rd.forward(request, response);
			} else {
				loaibo lbo = new loaibo();
				ArrayList<loaibean> dsloai = lbo.getloai();
				skincarebo sbo = new skincarebo();
				ArrayList<skincarebean> dsskin = sbo.getskin();

				lichsubo lsbo = new lichsubo();
				ArrayList<lichsubean> dsls = lsbo.getls();

				String ml = request.getParameter("ml");
				String key = request.getParameter("txttim");
				if (ml != null)
					dsskin = sbo.tim(ml);
				else if (key != null)
					dsskin = sbo.tim(key);

				request.setAttribute("dsloai", dsloai);
				request.setAttribute("dskin", dsskin);
				request.setAttribute("dsls", dsls);
			}

			RequestDispatcher rd = request.getRequestDispatcher("lichsu.jsp");
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
