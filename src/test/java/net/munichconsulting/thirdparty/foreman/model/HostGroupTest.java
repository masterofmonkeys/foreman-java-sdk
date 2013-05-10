package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HostGroupTest {

	private HostGroup entity;

	@Test
	public void testGetters() {
		entity = new HostGroup();

		assertNull(entity.getId());
		entity.setId(1L);
		assertEquals(entity.getId(), Long.valueOf(1L));

		assertNull(entity.getLabel());
		entity.setLabel("label");
		assertEquals(entity.getLabel(), "label");

		assertNull(entity.getAncestry());
		entity.setAncestry("ancestry");
		assertEquals(entity.getAncestry(), "ancestry");

		assertNull(entity.getName());
		entity.setName("name");
		assertEquals(entity.getName(), "name");

		List<Long> ids = new ArrayList<Long>();

		assertNull(entity.getPuppetClassIds());
		entity.setPuppetClassIds(ids);
		assertEquals(entity.getPuppetClassIds(), ids);

		assertNull(entity.getOperatingSystemId());
		entity.setOperatingSystemId(1L);
		assertEquals(entity.getOperatingSystemId(), Long.valueOf(1L));

		assertNull(entity.getArchitectureId());
		entity.setArchitectureId(1L);
		assertEquals(entity.getArchitectureId(), Long.valueOf(1L));
		
		assertNull(entity.getEnvironmentId());
		entity.setEnvironmentId(1L);
		assertEquals(entity.getEnvironmentId(), Long.valueOf(1L));

		assertNull(entity.getSubnetId());
		entity.setSubnetId(1L);
		assertEquals(entity.getSubnetId(), Long.valueOf(1L));

		assertNull(entity.getDomainId());
		entity.setDomainId(1L);
		assertEquals(entity.getDomainId(), Long.valueOf(1L));

		Map<String, String> parameters = new HashMap<String, String>();
		assertNull(entity.getParameters());
		entity.setParameters(parameters);
		assertEquals(entity.getParameters(), parameters);

		
		HostGroup template = new HostGroup();
		template.setId(100L);
		template.setAncestry("ancestry");
		entity = new HostGroup(template);
		assertNull(entity.getId());
		assertEquals(entity.getAncestry(), "ancestry");
		
		
	}

}
