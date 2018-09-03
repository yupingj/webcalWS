package com.mltech.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/webcal")
public class WebCalWS {
	
	@GET
	@Path("/{name}")
	public Response getMsg(@PathParam("name") String name) {
		String output = "<html> " + "<title>" + "Java WebService Example" + "</title>"  + "<body><h1><div style='font-size: larger;'>"
				+ "Hello <span style='text-transform: capitalize; color: green;'>" + name + "</span></div></h1></body>" + "</html>";
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/add/{varX}/{varY}")
	@Produces(MediaType.TEXT_PLAIN)
	public String add(@PathParam("varX") String varX,
		    @PathParam("varY") String varY) {
		int num1 = Integer.parseInt(varX);
		int num2 = Integer.parseInt(varY);
		return String.valueOf(num1+num2);
	}

}
