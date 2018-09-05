package com.mltech.webservice;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mltech.entity.Address;
import com.mltech.entity.Customer;

@Path("/customer")
public class CustomerWS {
	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer findCustomer(@PathParam("id") String myid) {
		
		Address myaddress = new Address("Hidden Creek", "39129", "Westland", "48185", "MI");
		
		
		
		Customer myct= new Customer(888, "Yuping", "Jiang", new Date(), myaddress);
		
		return myct;
	}
}
