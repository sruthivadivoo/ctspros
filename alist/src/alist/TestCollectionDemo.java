package alist;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class TestCollectionDemo {

		public static void main(String[] args) throws IOException
		{
			List list=new ArrayList();
			list.add(10);
			list.add("Ankit");
			list.add(356.90);
			list.add(true);
			list.add('a');
			System.out.println("The size of the list is +" + " "+list.size());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name to search");
			String keyelement=br.readLine();
			System.out.println(list);
			if(list.contains(keyelement))
			{
				System.out.println("The index of that object is" + " "+list.indexOf(keyelement));
			}
			List<String> list1=new ArrayList<String>();
			System.out.println("How many names do you want to store");
			int num_of_record=Integer.parseInt(br.readLine());
			for(int i=0; i<num_of_record ; i++)
			{
				System.out.println("Enter name");
				list1.add(br.readLine());
			}
			Object[] names=list1.toArray();
			for(Object x: names)
			{
				System.out.println(x);
			}
			
			list.addAll(list1);
			System.out.println(list1);
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Object o= i.next();
				System.out.println(o);
			}
			System.out.println("The size of list1 is" + ""+ list.size());
			System.out.println(list1.remove(true));
			if(list.remove(true))
					{
				
				System.out.println("Sucessfully removed"+ "" + "Now current size of list is" + list.size());
			}
			System.out.println(list.retainAll(list1));
				System.out.println(list.size());
			
				
			
			
			
			
		}
		
		
	}

