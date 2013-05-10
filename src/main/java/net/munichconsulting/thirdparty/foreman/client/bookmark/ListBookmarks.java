package net.munichconsulting.thirdparty.foreman.client.bookmark;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.BookmarkWrapper;

/**
 * List all bookmarks. (url: GET /api/bookmarks).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ListBookmarks implements ForemanCommand<BookmarkWrapper[]> {
	
	@Override
	public BookmarkWrapper[] execute(WebTarget target) {
		return target.path("bookmarks").request(MediaType.APPLICATION_JSON)
				.get(BookmarkWrapper[].class);
	}


}
