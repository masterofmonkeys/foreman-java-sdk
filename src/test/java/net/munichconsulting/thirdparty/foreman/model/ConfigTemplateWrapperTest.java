package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ConfigTemplateWrapperTest {

	private ConfigTemplateWrapper entity;

	@Test
	public void testGetters() {
		entity = new ConfigTemplateWrapper();

		ConfigTemplate obj = new ConfigTemplate();
		assertNull(entity.getConfigTemplate());
		entity.setConfigTemplate(obj);
		assertEquals(entity.getConfigTemplate(), obj);
		}
	
}
