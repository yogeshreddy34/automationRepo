package packCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Demo83 {

	
	//Set<String> names=new HashSet<String>();//-->values will be stored randomely
	Set<String> names=new LinkedHashSet<String>();//-->values will be stored sequenctially
		public void SetExm() {
			names.add("abc");
			names.add("xyz");
			names.add("abc");
			names.add(null);
			for(String s:names) {
				System.out.println(s);
			}
			
		}
		public static void main(String[] args) {
			Demo83 obj=new Demo83();
			obj.SetExm();
		}
		
}
