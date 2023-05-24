package com.jnb.api;

import java.security.SecureRandom;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/account")
public class AccountServiceApi {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getBalance(@QueryParam("accountNo") String accountNo) {
		SecureRandom random = new SecureRandom();
		double balance = random.nextDouble();
		return Double.parseDouble(accountNo);
	}
}
