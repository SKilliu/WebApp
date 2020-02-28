package ua.skiliushyk;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/answer")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String answer = request.getParameter("answer");

		request.setAttribute("userAnswer", "");

		if (answer == null) {
			request.setAttribute("userAnswer", "Make your choise, please");
		} else if (answer.equals("juva")) {
			request.setAttribute("userAnswer", "Yeah! You are write!");
		} else {
			request.setAttribute("userAnswer", "No! You are wrong!");
		}

		getServletContext().getRequestDispatcher("/pages/answer.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/pages/answer.jsp").forward(request, response);
	}
}
