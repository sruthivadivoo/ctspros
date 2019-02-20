package com.cognizant.pack1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo {
	public static void main(String[] args)
	{
		Queue<Integer> q=new LinkedList<Integer>();
		//Queue<String> q=new PriorityQueue<>();
		//Queue<String> q=new ArrayDeque<>();
		
		q.add(1);
		q.offer(20);
		
		System.out.println(q.element());
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		System.out.println(q.size());
		
	}

}
