package net.munichconsulting.thirdparty.foreman.client.bookmark;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.BookmarkWrapper;

/**
 * Creates a bookmark. (url: POST /api/bookmarks).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class CreateBookmark implements ForemanCommand<BookmarkWrapper> {
	
	private BookmarkWrapper wrapper;

	public CreateBookmark(BookmarkWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public BookmarkWrapper execute(WebTarget target) {
		return target.path("bookmarks").request(MediaType.APPLICATION_JSON)
				.post(Entity.json(wrapper), BookmarkWrapper.class);
	}

}
