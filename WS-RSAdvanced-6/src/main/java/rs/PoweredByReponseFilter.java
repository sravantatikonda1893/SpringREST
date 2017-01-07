/*Requestfilter and responsefilter are the two types of filters in jax-rs
RequestFilter executes before a request is served
ResponseFilter executes after a response is prepared and about to be sent
*/

package rs;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
//As this is implementing this. This acts as a response filter. the JAX-RS framework calls  this filter method implementation
//and when it is ready to send before it is about to send the response 
@Provider
//Annotation Conveys this as a special functionality
public class PoweredByReponseFilter implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException
	{	
//		This is shown in the header of the resonse
		requestContext.getHeaders().add("Powered by", "Sravan tatikonda");
		
		
		
		
		
	}
	

}
