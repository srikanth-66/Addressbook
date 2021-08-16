package com.io;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UC4 {
	public void delete(Map<String, Object> map, List<String> name) {
		System.out.print("Enter name to delete contact details - ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.next();
		map.remove(getUserInput);

	}
}