package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code Bookmark} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */

public class BookmarkWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("bookmark")
	private Bookmark bookmark;

	/**
	 * @return the bookmark
	 */
	public Bookmark getBookmark() {
		return bookmark;
	}

	/**
	 * @param bookmark the bookmark to set
	 */
	public void setBookmark(Bookmark bookmark) {
		this.bookmark = bookmark;
	}
	
	

}
