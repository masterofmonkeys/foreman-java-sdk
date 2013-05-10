package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OperatingSystemTest {

	private OperatingSystem entity;

	@Test
	public void testGetters() {
		entity = new OperatingSystem();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));

		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");

		assertNull(entity.getReleaseName());
		entity.setReleaseName("release");
		assertEquals(entity.getReleaseName(), "release");
		
		assertNull(entity.getFamily());
		entity.setFamily("family");
		assertEquals(entity.getFamily(), "family");

		assertNull(entity.getMajor());
		entity.setMajor("major");
		assertEquals(entity.getMajor(), "major");

		assertNull(entity.getMinor());
		entity.setMinor("minor");
		assertEquals(entity.getMinor(), "minor");

		List<ArchitectureWrapper> aw = new ArrayList<ArchitectureWrapper>();
		assertNull(entity.getArchitectures());
		entity.setArchitectures(aw);
		assertEquals(entity.getArchitectures(), aw);
		
		List<ConfigTemplateWrapper> ctw = new ArrayList<ConfigTemplateWrapper>();
		assertNull(entity.getConfigTemplates());
		entity.setConfigTemplates(ctw);
		assertEquals(entity.getConfigTemplates(), ctw);		
	
		
		List<MediaWrapper> mw = new ArrayList<MediaWrapper>();
		assertNull(entity.getMedia());
		entity.setMedia(mw);
		assertEquals(entity.getMedia(), mw);	
		
		List<PTableWrapper> ptw = new ArrayList<PTableWrapper>();
		assertNull(entity.getPtables());
		entity.setPtables(ptw);
		assertEquals(entity.getPtables(), ptw);	
	}

}
