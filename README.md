# Foreman Java SDK v1.0


## Maven Artifact

Add the dependency to your maven project.

```xml
	<dependency>
		<groupId>net.munichconsulting.thirdparty</groupId>
		<artifactId>foreman</artifactId>
		<version>1.0.0-SNAPSHOT</version>
	</dependency>
```

## Usage

Get a `ForemanClient` instance - by providing your API's URL, username and password, and then you can invoke any Foreman command, like GetDashboad, list all hostgroup defined...

```java

   ForemanClient client = new ForemanClient(FOREMAN_API_URL, "username", "password");
   Dashboard dashboard = client.execute(new GetDashboard());
   
   HostGroupWrapper[] groups = client.execute(new ListHostGroups());
   for (int i = 0; i < groups.length; i++) {
       System.out.println(groups[i].getHostGroup().getLabel());
       System.out.println(groups[i].getHostGroup().getParameters());	
   }   

```
