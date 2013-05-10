package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MediaTest {

	private Media entity;

	@Test
	public void testGetters() {
		entity = new Media();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));
	
	
		assertNull(entity.getMedia());
		entity.setMedia("media");
		assertEquals(entity.getMedia(), "media");

		assertNull(entity.getPath());
		entity.setPath("path");
		assertEquals(entity.getPath(), "path");
			
	}
	
}
