package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myarray=new ArrayList<String>();
		
		myarray.add("Sush");
		myarray.add("Sonu");
		myarray.add("Ashika");
		myarray.add("Sam");
		
		System.out.println("Before Sorting");
		System.out.println("Array list: " +myarray);
		
		
		Collections.sort(myarray);
		
		System.out.println("After Sorting");
		System.out.println("Array list: " +myarray);
		
		Collections.sort(myarray,Collections.reverseOrder());
		
		System.out.println("After Descending Order: " +myarray);
		
		Stack<String> arraylist=new Stack<String>();
		arraylist.push("Sush");
		arraylist.push("Sona");
		arraylist.pop();
		
		System.out.println("Stack list: " +arraylist);
		
		
		
		

	}

}
