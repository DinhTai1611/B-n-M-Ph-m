package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.giobean;
import bean.khachhangbean;
import bo.chitietbo;
import bo.giobo;
import bo.hoadonbo;

/**
 * Servlet implementation class xacnhancontroller
 */
@WebServlet("/xacnhancontroller")
public class xacnhancontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public xacnhancontroller() {
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
				hoadonbo hdbo = new hoadonbo();
				chitietbo ctbo = new chitietbo();
				hdbo.them(kh.getMakh());
				long maxhd = hdbo.maxhd();
				giobo g = (giobo) session.getAttribute("g");
				for (giobean h : g.ds) {
					ctbo.them(h.getMaskincare(), h.getSoluongmua(), maxhd);
				}
				session.removeAttribute("gh");
				response.sendRedirect("lichsucontroller");
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
