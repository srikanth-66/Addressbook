package com.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UC13 {
	File file=new File("data.txt");
	public void fileWrite(Map<String, Object> map, List<String> name) throws IOException {

		FileWriter fileWriter=new FileWriter(file,true);
		for(int i=0;i<map.size();i++) {
			List list=((List<String>) map.get(name.get(i)));
			fileWriter.write("\n"+list.toString());
		}

		fileWriter.close();	

	}

	public void fileRead() throws FileNotFoundException {
		Scanner read=new Scanner(file);
		while(read.hasNext()) {
			System.out.println(read.nextLine());
		}

	}
}