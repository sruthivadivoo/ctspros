package sample;

import java.util.Scanner;

public class numbs {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int d=sc.nextInt();
	String s=Integer.toString(d);
	StringBuilder sb=new StringBuilder(s);
	StringBuilder sb1=new StringBuilder(s);
	sb.reverse();
	if(sb1.equals(sb))
		System.out.println("palindrome");
	else
		System.out.println("no");
}
}
