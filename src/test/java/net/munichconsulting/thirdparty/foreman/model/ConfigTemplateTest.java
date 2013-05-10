package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ConfigTemplateTest {

	private ConfigTemplate entity;

	@Test
	public void testGetters() {
		entity = new ConfigTemplate();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));

		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");

		assertNull(entity.getAuditComment());
		entity.setAuditComment("comment");
		assertEquals(entity.getAuditComment(), "comment");	

		assertNull(entity.getSnippet());
		entity.setSnippet("snippet");
		assertEquals(entity.getSnippet(), "snippet");	

		assertNull(entity.getTemplate());
		entity.setTemplate("template");
		assertEquals(entity.getTemplate(), "template");	

		TemplateKind templateKind = new TemplateKind();
		assertNull(entity.getTemplateKind());
		entity.setTemplateKind(templateKind);
		assertEquals(entity.getTemplateKind(), templateKind);

	}

}
