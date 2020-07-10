package com.angularpoc.service;

import org.springframework.stereotype.Service;

@Service
public class BatchRequestService {
	
	public String runRequestNow(int rqstId) {
		return "Batch Request running now!!";
	}

}
