package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class BookmarkWrapperTest {

	private BookmarkWrapper entity;

	@Test
	public void testGetters() {
		entity = new BookmarkWrapper();

		Bookmark obj = new Bookmark();
		assertNull(entity.getBookmark());
		entity.setBookmark(obj);
		assertEquals(entity.getBookmark(), obj);
		}
	
}
