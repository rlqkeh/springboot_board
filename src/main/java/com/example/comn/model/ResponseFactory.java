package com.example.comn.model;

import java.util.List;

public class ResponseFactory {
	
	public static ResponseCode getResponseCode(int code) {
		ResponseCode responseCode = new ResponseCode();
		responseCode.setCode(code);
		switch(code) {
			case 200:responseCode.setMsg("Sucess");
				break;
			default:
				responseCode.setMsg("Fail");
				break;
		}
		return responseCode;
	}
	
	public static <T> ResponseSingle getResponseSingle(T data) {
		
		ResponseSingle responseSingle = new ResponseSingle(data);
		responseSingle.setCode(200);
		responseSingle.setMsg("Sucess");
		
		return responseSingle;
	}
	
	public static <T> ResponseList<T> getResponseList(List<T> data){
		
		ResponseList responseList = new ResponseList(data);
		responseList.setCode(200);
		responseList.setMsg("Sucess");
		
		return responseList;
		
	}

}
