package ua.skiliushyk.util;

import javax.servlet.http.HttpServletRequest;

import ua.skiliushyk.Constants;
import ua.skiliushyk.model.Playlist;

public class SessionUtils {
	public static Playlist getCurrentPlaylist(HttpServletRequest req) {
		Playlist playlist = (Playlist) req.getSession().getAttribute(Constants.CURRENT_PLAYLIST);
		if (playlist == null) {
			playlist = new Playlist();
			setCurrentPlaylist(req, playlist);
		}
		return playlist;
	}

	public static boolean isCurrentPlaylistCreated(HttpServletRequest req) {
		return req.getSession().getAttribute(Constants.CURRENT_PLAYLIST) != null;
	}

	public static void setCurrentPlaylist(HttpServletRequest req, Playlist playlist) {
		req.getSession().setAttribute(Constants.CURRENT_PLAYLIST, playlist);
	}

}
