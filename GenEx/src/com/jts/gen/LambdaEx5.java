package com.jts.gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEx5 {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<>();
		
		list.add(new Employ(1,"Prasanna",58344)); 
		list.add(new Employ(3,"Darshan",53222));
		list.add(new Employ(4,"Vidya",62133)); 
		list.add(new Employ(5,"Chaithra",62334));
		
		Collections.sort(list,(e1,e2)->{
			return e1.name.compareTo(e2.name);
		});
		
		list.forEach(System.out::println);

	}
}
