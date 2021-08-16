package com.io;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UC10 {
	public void getCountOfPerson(Map<String, Object> map, List<String> name) {
		int count=0,flag=0;
		System.out.print("Enter city name- ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.next();

		for (int i = 0; i < map.size(); i++) {
			if (((List<String>) map.get(name.get(i))).get(2).equals(getUserInput)) {
				List li = ((List<String>) map.get(name.get(i)));
				count =(int) li.stream().map(data -> data).count();
				if(count==7) {
					flag++;
				}
			}
		}

		System.out.println(getUserInput+"::"+flag);
	}
}