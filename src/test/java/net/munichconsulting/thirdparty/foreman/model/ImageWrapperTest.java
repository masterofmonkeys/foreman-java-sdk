package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ImageWrapperTest {

	private ImageWrapper entity;

	@Test
	public void testGetters() {
		entity = new ImageWrapper();

		Image obj = new Image();
		assertNull(entity.getImage());
		entity.setImage(obj);
		assertEquals(entity.getImage(), obj);
		}
	
}
