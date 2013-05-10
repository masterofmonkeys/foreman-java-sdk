package net.munichconsulting.thirdparty.foreman.client.bookmark;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.BookmarkWrapper;

/**
 * Show a bookmark. (url: GET /api/bookmarks/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ShowBookmark implements ForemanCommand<BookmarkWrapper> {
	
	private String id;
	
	public ShowBookmark(String id) {
		this.id = id;
	}
	
	@Override
	public BookmarkWrapper execute(WebTarget target) {
		return target.path("bookmarks").path(id).request(MediaType.APPLICATION_JSON)
				.get(BookmarkWrapper.class);
	}


}
