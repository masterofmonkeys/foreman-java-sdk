Foreman Java SDK v1.0
=============

Maven
-------------
<code>
	<dependency>
		<groupId>net.munichconsulting.thirdparty</groupId>
		<artifactId>foreman</artifactId>
		<version>1.0.0-SNAPSHOT</version>
	</dependency>
</code>

Usage
-------------
<pre>

   ForemanClient client = new ForemanClient(FOREMAN_API_URL, "username", "password");
   Dashboard dashboard = client.execute(new GetDashboard());
   
   HostGroupWrapper[] groups = client.execute(new ListHostGroups());
   for (int i = 0; i < groups.length; i++) {
       System.out.println(groups[i].getHostGroup().getLabel());
 	   System.out.println(groups[i].getHostGroup().getParameters());	
   }   

</pre>