package com.cognizant.pack1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestLinkedListDemo {
	public static void main(String[] args)
	{
		
	List<String> list1=new LinkedList<String>();
	list1.add("Ankit");
	list1.add("ravi");
	list1.add(0, "Ram");
	
	System.out.println(list1.size());
	for(String li: list1)
	{
		System.out.println(li);
	}
	LinkedList<Integer> list2=new LinkedList();
	list2.add(10);
	list2.add(20);
	
	list2.addFirst(30);
			list2.addLast(70);
			list2.add(2, 50);
			list2.push(45);
			list2.set(1, 80);
			
			ListIterator<Integer> iterator1=list2.listIterator();
			while(iterator1.hasNext())
			{
				System.out.println((Integer)iterator1.next());
			}
		System.out.println("*******Printing reverse order******");	
	while(iterator1.hasPrevious())
	{
		System.out.println((Integer)iterator1.previous());
	}
	System.out.println(list2.size());
	System.out.println(list2.getFirst());
	System.out.println(list2.getLast());
	System.out.println("Removing using poll method" +list2.poll());
	System.out.println(list2.size());
	
	
	
	
	
	
	}
	
	
	
	

}
