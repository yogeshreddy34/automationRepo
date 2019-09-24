package packCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo82 {
	
	//collection is interface--->different kind of data type values storing
	//collection is resizable array
	//array is fixed sized array-->similar kind of data type values storing
	//collection-->list,set,map
	//List-->array list,linked list-->allows duplicate and null
	//set-->hashset,linked hashset-->doesn't allow duplicate but allow null
	//map-->hashmap,linked hashmap-->map is key and value pair,
	//key-->doesn't allow suplicate but allow null
	//value-->allows duplicate and null.
	
	
	//List<String> names=new ArrayList<String>();//-->values will be stored randomely
	List<String> names=new LinkedList<String>();//-->values will be stored sequenctially
	public void listExm() {
		names.add("abc");
		names.add("xyz");
		names.add("abc");
		names.add(null);
		for(String s:names) {
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		Demo82 obj=new Demo82();
		obj.listExm();
	}
	

}
