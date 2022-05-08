/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.o2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.o2.model.O2ServiceRequest;
import com.o2.model.O2ServiceResponse;

/**
 * @author YNBR 14-Mar-2022
 *
 */
@RequestMapping("/v1/mobile")
@RestController
public class O2Controller {
	@PostMapping("/verify")
	public  O2ServiceResponse verify(@RequestBody O2ServiceRequest request,
			@RequestHeader(name="clientId",required =true) String clientId,
			@RequestHeader(name="requestId",required=true) String requestId,
			@RequestHeader(name="messageTs",required=true) String messageTs,
			@RequestHeader(name="version",required=true) String version
			) {
		System.out.println("---------Enter into O2 COntroller---------");
		
		O2ServiceResponse response=new O2ServiceResponse();		
		response.setRespCode("0");
		response.setRespMsg("success");
		response.setValid(true);
		response.setDecription("Successfully validated");
		System.out.println("---------Exit into O2 COntroller---------");
		return response;
		
	}
	@GetMapping("/validation")
	public  String validation(
			) {
		
		
		
		return "response1";
		
	}

}
