package com.io;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UC12 {
	public void sortByCityName(Map<String, Object> map, List<String> name) {
		List<List> storeList = new ArrayList<List>();

		for (int i = 0; i < map.size(); i++) {
			List<String> list = new ArrayList<String>();
			list.addAll(((List<String>) map.get(name.get(i))));
			storeList.add(list);
		}

		List sortData = storeList.stream().map(data -> data.get(2)).sorted().collect(Collectors.toList());
		System.out.println(sortData);


	}
}