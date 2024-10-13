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
import bo.loaibo;

/**
 * Servlet implementation class adminloaicontroller
 */
@WebServlet("/adminloaicontroller")
public class adminloaicontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public adminloaicontroller() {
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

			String maloai = request.getParameter("txtmaloai");
			String tenloai = request.getParameter("txttenloai");
			loaibo lbo = new loaibo();
			ArrayList<loaibean> ds = lbo.getloai();
			if (request.getParameter("butadd") != null)
				lbo.them(maloai, tenloai);
			else if (request.getParameter("butupdate") != null)
				lbo.sua(tenloai, maloai);
			else {
				String tab = request.getParameter("tab");
				String ml = request.getParameter("ml");
				if (tab != null) {
					if (tab.equals("select")) {
						request.setAttribute("teanloai", lbo.tim(ml));
						request.setAttribute("maloai", ml);
					} else
						lbo.xoa(ml);
				}
			}

			request.setAttribute("ds", lbo.getloai());
			RequestDispatcher rd = request.getRequestDispatcher("adminloai.jsp");
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
