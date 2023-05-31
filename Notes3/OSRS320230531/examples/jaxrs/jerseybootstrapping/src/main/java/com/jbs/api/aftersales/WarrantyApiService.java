package com.jbs.api.aftersales;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/warranty")
public class WarrantyApiService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String findWarranty(@QueryParam("serialNo") String serialNo) {
		System.out.println("warranty hashCode : " + this.hashCode());
		return "In Warranty";
	}

}
