package CollectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer, String> Hm = new HashMap<Integer, String>();
    Hm.put(0, "USA");
    Hm.put(1, "UK");
    Hm.put(2, "India");
    Hm.put(3, "Maldives");
    
    Set sn=Hm.entrySet();
    Iterator i= sn.iterator();  
    while(i.hasNext()) {
    Map.Entry mp=(Map.Entry)i.next();
    System.out.println(mp.getKey());
    System.out.println(mp.getValue());
    }
    
	}

}
