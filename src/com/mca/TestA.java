package com.mca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestA {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("10","30","30","40"));
		System.out.println(list);
		
		for(String str:list) {
			if(str.equals("30")) {
				list.remove(str);
			}
		}
		//System.out.println(list);
	}
}
