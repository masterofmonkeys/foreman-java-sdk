package net.munichconsulting.thirdparty.foreman.client.bookmark;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.BookmarkWrapper;


/**
 * Update a bookmark. (url: PUT /api/bookmarks/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class UpdateBookmark implements ForemanCommand<BookmarkWrapper> {
	
	private BookmarkWrapper wrapper;

	public UpdateBookmark(BookmarkWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public BookmarkWrapper execute(WebTarget target) {
		return target.path("bookmark").path(wrapper.getBookmark().getId().toString()).request(MediaType.APPLICATION_JSON)
				.put(Entity.json(wrapper), BookmarkWrapper.class);
	}

}
