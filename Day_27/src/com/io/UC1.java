package com.io;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UC1 {

	Scanner scanInput = new Scanner(System.in);
	Contact contact = new Contact();

	public void add(Map<String, Object> map,List<String> name) {
		List<String> list=new ArrayList<String>();
		System.out.print("Enter name- ");
		String fullName = scanInput.nextLine();
		contact.setFullName(fullName);

		System.out.print("Enter address - ");
		String address = scanInput.nextLine();
		contact.setAddress(address);

		System.out.print("Enter cityName - ");
		String cityName = scanInput.nextLine();
		contact.setCityName(cityName);

		System.out.print("Enter stateName - ");
		String stateName = scanInput.nextLine();
		contact.setStateName(stateName);

		System.out.print("Enter zipCode - ");
		String zipCode = scanInput.nextLine();
		contact.setZipCode(zipCode);

		System.out.print("Enter phoneNumber - ");
		String phoneNumber = scanInput.nextLine();
		contact.setPhoneNumber(phoneNumber);

		System.out.print("Enter emailAddress - ");
		String emailAddress = scanInput.nextLine();
		contact.setEmailAddress(emailAddress);

		list.add(contact.getFullName());
		list.add(contact.getEmailAddress());
		list.add(contact.getCityName());
		list.add(contact.getAddress());
		list.add(contact.getPhoneNumber());
		list.add(contact.getStateName());
		list.add(contact.getZipCode());
		name.add(contact.getFullName());


		map.put(contact.getFullName(), list);

	}

	public void print(Map<String, Object> map,List<String> name) {
		for(int i=0;i<map.size();i++) {
			
			System.out.println(map.get(name.get(i)));
		}
	}

}
