package com.io;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UC14 {
	public void fileWriteCsv(Map<String, Object> map, List<String> name) throws IOException {
		List<List> data = new ArrayList<List>();
		int skipData=0;
		FileWriter csvWriter = new FileWriter("new.csv", true);
//		if(skipData==0) {
//			csvWriter.append("Name");
//			csvWriter.append(",");
//			csvWriter.append("email");
//			csvWriter.append(",");
//			csvWriter.append("city");
//			csvWriter.append(",");
//			csvWriter.append("address");
//			csvWriter.append(",");
//			csvWriter.append("phone");
//			csvWriter.append(",");
//			csvWriter.append("state");
//			csvWriter.append(",");
//			csvWriter.append("pin");
//			skipData=1;
//		}
		csvWriter.append("\n");

		for (int i = 0; i < map.size(); i++) {
			data.add((List<List>) map.get(name.get(i)));

		}

		for (List<String> rowData : data) {
			csvWriter.append(String.join(",", rowData));
			csvWriter.append("\n");
		}

		csvWriter.flush();
		csvWriter.close();
	}

	public void fileReadCsv() throws IOException {
		BufferedReader csvReader = new BufferedReader(new FileReader("new.csv"));
		String row;
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",");
		    System.out.println(data);
		}

		csvReader.close();
	}

}