package com.base.utils;

import java.util.UUID;


public class Guid {
	
	public static String get(){
		return UUID.randomUUID().toString().replaceAll("-","");
	}
	
	public static void main(String[] args){
		System.out.println(get().toUpperCase());
	}
	
}