package com.jbs.init;

import org.glassfish.jersey.server.ResourceConfig;

import com.jbs.api.ProductApiService;
import com.jbs.api.aftersales.WarrantyApiService;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class JBSResourceConfig extends ResourceConfig {

	public JBSResourceConfig() {
		register(ProductApiService.class);
		register(new WarrantyApiService());
	}
}
