package com.jbs.api;

import java.security.SecureRandom;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/product")
public class ProductApiService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getProductPrice(@QueryParam("productNo") String productNo) {
		System.out.println("productApi hashCode: " + this.hashCode());
		return new SecureRandom().nextDouble(999999);
	}
}
