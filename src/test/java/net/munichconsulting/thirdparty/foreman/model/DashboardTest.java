package net.munichconsulting.thirdparty.foreman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DashboardTest {

	private Dashboard entity;

	@Test
	public void testGetters() {
		entity = new Dashboard();

		assertNull(entity.getDisabledHosts());
		entity.setDisabledHosts(1);
		assertEquals(entity.getDisabledHosts(), Integer.valueOf(1));

		assertNull(entity.getOkHosts());
		entity.setOkHosts(1);
		assertEquals(entity.getOkHosts(), Integer.valueOf(1));

		assertNull(entity.getGoodHosts());
		entity.setGoodHosts(1);
		assertEquals(entity.getGoodHosts(), Integer.valueOf(1));

		assertNull(entity.getActiveHostsOk());
		entity.setActiveHostsOk(1);
		assertEquals(entity.getActiveHostsOk(), Integer.valueOf(1));

		assertNull(entity.getPendingHostsEnabled());
		entity.setPendingHostsEnabled(1);
		assertEquals(entity.getPendingHostsEnabled(), Integer.valueOf(1));

		assertNull(entity.getActiveHostsOkEnabled());
		entity.setActiveHostsOkEnabled(1);
		assertEquals(entity.getActiveHostsOkEnabled(), Integer.valueOf(1));

		assertNull(entity.getGoodHostsEnabled());
		entity.setGoodHostsEnabled(1);
		assertEquals(entity.getGoodHostsEnabled(), Integer.valueOf(1));

		assertNull(entity.getActiveHosts());
		entity.setActiveHosts(1);
		assertEquals(entity.getActiveHosts(), Integer.valueOf(1));

		assertNull(entity.getPercentage());
		entity.setPercentage(1);
		assertEquals(entity.getPercentage(), Integer.valueOf(1));

		assertNull(entity.getOutOfSyncHosts());
		entity.setOutOfSyncHosts(1);
		assertEquals(entity.getOutOfSyncHosts(), Integer.valueOf(1));

		assertNull(entity.getTotalHosts());
		entity.setTotalHosts(1);
		assertEquals(entity.getTotalHosts(), Integer.valueOf(1));

		assertNull(entity.getBadHosts());
		entity.setBadHosts(1);
		assertEquals(entity.getBadHosts(), Integer.valueOf(1));

		assertNull(entity.getOutOfSyncHostsEnabled());
		entity.setOutOfSyncHostsEnabled(1);
		assertEquals(entity.getOutOfSyncHostsEnabled(), Integer.valueOf(1));

		assertNull(entity.getPendingHosts());
		entity.setPendingHosts(1);
		assertEquals(entity.getPendingHosts(), Integer.valueOf(1));

		assertNull(entity.getOkHostsEnabled());
		entity.setOkHostsEnabled(1);
		assertEquals(entity.getOkHostsEnabled(), Integer.valueOf(1));

		assertNull(entity.getBadHostsEnabled());
		entity.setBadHostsEnabled(1);
		assertEquals(entity.getBadHostsEnabled(), Integer.valueOf(1));

		assertNull(entity.getReportsMissing());
		entity.setReportsMissing(1);
		assertEquals(entity.getReportsMissing(), Integer.valueOf(1));

	}

}
