package ua.skiliushyk.servlet;

import java.io.IOException;
import java.util.Map;

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
		String playlist = request.getParameter("playlist");
		Map<String, String[]> songs = request.getParameterMap();
		
		if (playlist != null) {
			int soundtrackNumber = Integer.parseInt(playlist);
			Soundtrack soundtrack = new Soundtrack();
			String pathToFile = soundtrack.soundtrackFinder(soundtrackNumber).getPathToFile();
			soundtrack.setPathToFile(pathToFile);
			soundtrack.setTrackTitle(Constants.SOUNDTRACKS[soundtrackNumber]);
			request.setAttribute("filePath", pathToFile);
			request.setAttribute("currentTrack", soundtrack.getTrackTitle());
		} else {
			request.setAttribute("currentTrack", "Choose your track");
		}
		
		if (songs != null) {
			 for (Map.Entry<String, String[]> entry : songs.entrySet()) {
				 	String val = "";
				 	for(String tmp : entry.getValue()) {
				 		val = val + tmp;
				 	}
			        System.out.println(entry.getKey() + " = " + val);           
			    }
		} else {
			System.out.println("No songs in the playlist");
		}
//		String nxt = request.getParameter("nxt");
//		int soundtrackNumber = Integer.parseInt(nxt);
//		if (nxt == null) {
//			request.setAttribute("currentTrack", "Choose your track");
//		} else {
//			Soundtrack soundtrack = new Soundtrack();
//			String pathToFile = soundtrack.soundtrackFinder(soundtrackNumber).getPathToFile();
//			soundtrack.setPathToFile(pathToFile);
//			soundtrack.setTrackTitle(Constants.SOUNDTRACKS[soundtrackNumber]);
//			request.setAttribute("filePath", pathToFile);
//			request.setAttribute("currentTrack", soundtrack.getTrackTitle());
//		}

		getServletContext().getRequestDispatcher("/pages/music.jsp").forward(request, response);
	}

}
