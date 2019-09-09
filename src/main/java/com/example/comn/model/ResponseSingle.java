package com.example.comn.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseSingle<T> extends ResponseCode{
	T data;
	ResponseSingle(T data){
		this.data = data;
	}
}
