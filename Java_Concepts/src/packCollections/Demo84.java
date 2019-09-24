package packCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Demo84 {
	
	//Map<Integer,String> studentInfo=new HashMap<Integer,String>();
	Map<Integer,String> studentInfo=new LinkedHashMap<Integer,String>();
	public void mapExm() {
		studentInfo.put(11, "abc");
		studentInfo.put(12, "xyz");
		studentInfo.put(13, "lmn");
		studentInfo.put(14, "abc");
		studentInfo.put(null, null);
		studentInfo.put(13, "pqr");
		
		for(Entry<Integer, String> x:studentInfo.entrySet()) {
			System.out.println(x.getKey()+"  "+x.getValue());
		}
	}
	public static void main(String[] args) {
		Demo84 obj=new Demo84();
		obj.mapExm();
	}

}
