package com.io;
import java.util.List;
import java.util.Map;

public class UC7 {

	public int  checkForDuplicate(Map<String,Object> map,List<String> name,String fullName) {
		int flag=0;
		for(int i=0;i<name.size();i++) {
			if(((List<String>) map.get(name.get(i))).get(0).equals(fullName)) {
				flag=1;
			}
		}

		if(flag==1) {
			return 1;
		}else {
			return 0;
		}
	}

}