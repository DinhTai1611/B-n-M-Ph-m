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
 * Servlet implementation class themcontroller
 */
@WebServlet("/themcontroller")
public class themcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public themcontroller() {
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
			String ms = request.getParameter("ms");
			String ts = request.getParameter("ts");
			String giatam = request.getParameter("gia");
			if (ms != null && ts != null && giatam != null) {
				giobo g = null;
				long gia = Long.parseLong(giatam);
				if (session.getAttribute("g") == null) {
					g = new giobo();
					session.setAttribute("g", g);
				}
				g = (giobo) session.getAttribute("g");
				g.them(ms, ts, 1, gia);
				request.setAttribute("g", g);
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
