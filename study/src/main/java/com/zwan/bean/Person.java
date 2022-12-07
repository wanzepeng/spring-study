package com.zwan.bean;

import lombok.Data;

@Data
public class Person {

	public String id;
	public String name;

	public void sayHello() {
		System.out.println("Hello~");
	}
}
