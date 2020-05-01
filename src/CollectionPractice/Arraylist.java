package CollectionPractice;

import java.util.ArrayList;

public class Arraylist {
 public static void main(String[] args) {
		
     ArrayList<String> a=new ArrayList<String>();
     a.add("Apeksha");
     a.add("Java");
     a.add("Selenium");
     a.add("Appium");
     System.out.println(a);
     a.add(3, "Jmeter");
     System.out.println(a);
     a.remove("Java");
     System.out.println(a);
     a.remove(0);
     System.out.println(a);
    System.out.println(a.contains("Testing"));
    System.out.println(a.get(0));
     
	}

}
