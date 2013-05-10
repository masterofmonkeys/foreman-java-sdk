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

* Maven Repositories *

https://maven.java.net/content/repositories/snapshots
https://raw.github.com/muconsulting/maven/master/snapshots

Available artifacts
=============

Foreman Service
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


License
=============

<pre>
This software is licensed under the Apache 2 license, quoted below.

Copyright 2013 Sylvain Gibier and Foreman Java SDK

Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
</pre>