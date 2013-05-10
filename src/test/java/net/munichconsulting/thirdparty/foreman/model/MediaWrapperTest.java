package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MediaWrapperTest {

	private MediaWrapper entity;

	@Test
	public void testGetters() {
		entity = new MediaWrapper();

		Media obj = new Media();
		assertNull(entity.getMedia());
		entity.setMedia(obj);
		assertEquals(entity.getMedia(), obj);
		}
	
}
