package com.io;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UC5 {
	UC1 uc1=new UC1();
	public void addMultipleContact(Map<String,Object> map,List<String> name,Contact contact) {
		System.out.print("how many contact you want to enter - ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();

		for(int i=0;i<getUserInput;i++) {
			uc1.add(map, name);
		}

	}
}
