package com.io;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UC9 {
	List<String> city = new ArrayList<String>();
	List<String> state = new ArrayList<String>();

	public void directoryByStateAndCity(Map<String, Object> map, List<String> name,
			Map<String, List<String>> directoryForCity, Map<String, List<String>> directoryForState) {

		for (int i = 0; i < map.size(); i++) {
			String check = ((List<String>) map.get(name.get(i))).get(2);
			city.add(((List<String>) map.get(name.get(i))).get(2));
			state.add(((List<String>) map.get(name.get(i))).get(6));
		}

		HashSet<String> uniqueCity=new HashSet<String>(city);

		HashSet<String> uniqueState=new HashSet<String>(state);

		for(int j=0;j<map.size();j++) {
			String display = ((List<String>) uniqueCity).get(j);
			for(int k=0;k<map.size();k++) {
				if(display==((List<String>) map.get(name.get(k))).get(2)) {
				}
			}

		}

	}
}