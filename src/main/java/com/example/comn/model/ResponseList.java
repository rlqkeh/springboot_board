package com.example.comn.model;

import java.util.List;


import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ResponseList<T> extends ResponseCode{
	public ResponseList(List<T> data) {
		this.data = data;
	}
	private List<T> data;
}
