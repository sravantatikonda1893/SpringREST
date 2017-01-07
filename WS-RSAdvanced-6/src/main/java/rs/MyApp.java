package rs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
// <url-pattern>/webresources/*</url-pattern>--We dont need to add this in web.xml for configurations by below line
//This will be prepended for every path in the project
@ApplicationPath("/webresources")
public class MyApp extends Application 
{
	
	
	
}
