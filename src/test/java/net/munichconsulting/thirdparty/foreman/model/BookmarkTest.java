package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BookmarkTest {

	private Bookmark entity;

	@Test
	public void testGetters() {
		entity = new Bookmark();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
		assertNull(entity.getOwnerId());
		entity.setOwnerId(1L);
		assertEquals(entity.getOwnerId(), Long.valueOf(1L));
		
		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");
		
		assertNull(entity.getOwnerType());
		entity.setOwnerType("type");
		assertEquals(entity.getOwnerType(), "type");
		
		assertNull(entity.getController());
		entity.setController("controller");
		assertEquals(entity.getController(), "controller");
		
		assertNull(entity.getQuery());
		entity.setQuery("query");
		assertEquals(entity.getQuery(), "query");
		
		assertNull(entity.isInternalPublic());
		entity.setInternalPublic(true);
		assertTrue(entity.isInternalPublic());
		
	}
	
}
