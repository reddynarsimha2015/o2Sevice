/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.o2.model;

import lombok.Data;

/**
 * @author YNBR 14-Mar-2022
 *
 */
@Data
public class O2ServiceRequest {
	private String mobileNum;
	private String paymentDate;
	private String billDate;
	private String providerType;
	private String customerName;
	private float amount;
	
}
