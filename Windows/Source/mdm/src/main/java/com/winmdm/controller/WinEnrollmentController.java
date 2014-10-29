package com.winmdm.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
//@RequestMapping("/EnrollmentServer")
@Component
@Path("/EnrollmentServer")
public class WinEnrollmentController {

	/*@RequestMapping(method = RequestMethod.POST, value = "/Discovery")
	public @ResponseBody String postDiscovery(
			@RequestBody final String postDiscoveryRequest) {
		System.out.println("######### called post discovery");
		return "post discovery";
	}*/
	
	@POST
	@Path("/login")
	public Response postDiscovery(
			String postDiscoveryRequest) {
		System.out.println("######### called post discovery");
		//turn Response.status(200).entity("login").build();
		return Response.status(200)
				.type(MediaType.TEXT_HTML).entity("success").build();
	}
	
	

}
