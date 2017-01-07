package rs;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class LoggingFilter implements ContainerRequestFilter, ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext arg0) throws IOException {
		System.out.println("Request Headers: "+arg0.getHeaders());
	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {

		System.out.println("response filter");
		System.out.println("Response Headers: "+responseContext.getHeaders());
		
	}

}
