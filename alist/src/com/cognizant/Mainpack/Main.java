package com.cognizant.Mainpack;
import com.cognizant.Mypack1.Emplopyee;
import com.cognizant.Mypack2.*;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("\nEnter choice");
int choice=s.nextInt();
int id;
String name="";
double salary;
String address="";
boolean b=false;
EmployeeMaster ee=new EmployeeMaster();
ArrayList al=new ArrayList();
while(choice!=5)
{
	
if(choice==1)
{
	System.out.println("\nEnter id");
	id=s.nextInt();
	System.out.println("\nEnter name");
	name=s.next();
	System.out.println("\nEnter salary");
	salary=s.nextDouble();
	System.out.println("\nEnter address");
	address=s.next();
	Emplopyee es=new Emplopyee(id,name,salary,address);
	b=ee.addEmp(es);
}
	
else if(choice==2)
{
	System.out.println("\nEnter id to search ");
	id=s.nextInt();
	b=ee.getEmpById(id);
}
else if(choice==3)
	al=ee.getEmp();
	
else if(choice==4)
{
	System.out.println("\nEnter id  to remove");
	id=s.nextInt();
	b=ee.removeEmp(id);
}
else if(choice==5)
	break;
System.out.println("\nEnter choice");
choice=s.nextInt();
}
	
	}

}
