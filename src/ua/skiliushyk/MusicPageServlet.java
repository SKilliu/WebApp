package ua.skiliushyk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MusicPageServlet
 */
@WebServlet("/music")
public class MusicPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MusicPageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request.setAttribute("filePath", "/WebApp/music/Dust_Clears.mp3");
		request.getRequestDispatcher("/pages/music.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nxt = request.getParameter("nxt");
		if (nxt == null) {
			request.setAttribute("currentTrack", "Choose your track");
		} else if (nxt.equals("clears")) {
			request.setAttribute("filePath", "/WebApp/music/Dust_Clears.mp3");
			request.setAttribute("currentTrack", "Clean Bandit - Dust Clears");
		} else if (nxt.equals("finding")) {
			request.setAttribute("filePath", "/WebApp/music/Finding_Peace.mp3");
			request.setAttribute("currentTrack", "David James Terry - Finding Peace");
		}

		getServletContext().getRequestDispatcher("/pages/music.jsp").forward(request, response);
	}

}
