package ua.skiliushyk.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.skiliushyk.Constants;
import ua.skiliushyk.model.Soundtrack;

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
		getServletContext().getRequestDispatcher("/pages/music.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> songs = request.getParameterMap();
		String index = "";
		int attr = 0;

		// Get keys from a map
		Set<String> keys = songs.keySet();
		for (String k : keys) {
			index = k;
		}

		// Get values from a map
		Collection<String[]> values = songs.values();
		for (String[] v : values) {
			attr = Integer.parseInt(v[0]);
		}

		if (index.equals("playlist")) {

			// Checking a size of a map
			System.out.println(songs.size());

			int soundtrackNumber = attr;
			Soundtrack soundtrack = new Soundtrack();
			String pathToFile = soundtrack.soundtrackFinder(soundtrackNumber).getPathToFile();
			soundtrack.setPathToFile(pathToFile);
			soundtrack.setTrackTitle(Constants.SOUNDTRACKS[soundtrackNumber]);
			request.setAttribute("filePath", pathToFile);
			request.setAttribute("currentTrack", soundtrack.getTrackTitle());
		} else if (index.length() == 1) {
			for (Map.Entry<String, String[]> entry : songs.entrySet()) {
				String val = "";
				for (String tmp : entry.getValue()) {
					val = val + tmp;
				}
				System.out.println(entry.getKey() + " = " + val);
			}
		} else {
			request.setAttribute("currentTrack", "Choose your track");
		}

		getServletContext().getRequestDispatcher("/pages/music.jsp").forward(request, response);
	}

}
