package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TemplateKindWrapperTest {

	private TemplateKindWrapper entity;

	@Test
	public void testGetters() {
		entity = new TemplateKindWrapper();

		TemplateKind obj = new TemplateKind();
		assertNull(entity.getTemplateKind());
		entity.setTemplateKind(obj);
		assertEquals(entity.getTemplateKind(), obj);
		}
	
}
