package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ModelWrapperTest {

	private ModelWrapper entity;

	@Test
	public void testGetters() {
		entity = new ModelWrapper();

		Model obj = new Model();
		assertNull(entity.getModel());
		entity.setModel(obj);
		assertEquals(entity.getModel(), obj);
		}
	
}
