package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> hs =new HashSet<String>();
    hs.add("USA");
    hs.add("UK");
    hs.add("Italy");
    hs.add("Spain");
    hs.add("Spain");
    System.out.println(hs);
	hs.remove("Spain");	
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	System.out.println(hs.contains("USA"));
	
	Iterator<String> i=hs.iterator();
	System.out.println(i.next());
	System.out.println(i.next());
	while(i.hasNext()){
	System.out.println(i.next());	
	}
	}

}
