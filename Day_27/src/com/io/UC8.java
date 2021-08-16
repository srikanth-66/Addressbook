package com.io;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UC8 {
	public void showByCity(Map<String, Object> map, List<String> name) {
		System.out.print("1->search by city\t 2->search by state");
		Scanner scanInput = new Scanner(System.in);
		int getOption = scanInput.nextInt();

		if (getOption == 1) {
			System.out.print("Enter city name- ");
			String getUserInput = scanInput.next();

			for (int i = 0; i < map.size(); i++) {
				if (((List<String>) map.get(name.get(i))).get(2).equals(getUserInput)) {
					List li = ((List<String>) map.get(name.get(i)));
					List<String> showData = (List<String>) li.stream().map(data -> data).collect(Collectors.toList());
					System.out.println(showData);
				}
			}
		} else {
			System.out.print("Enter state name- ");
			String getUserInput = scanInput.next();

			for (int i = 0; i < map.size(); i++) {
				if (((List<String>) map.get(name.get(i))).get(3).equals(getUserInput)) {
					List li = ((List<String>) map.get(name.get(i)));
					List<String> showData = (List<String>) li.stream().map(data -> data).collect(Collectors.toList());
					System.out.println(showData);
				}
			}
		}

	}
}