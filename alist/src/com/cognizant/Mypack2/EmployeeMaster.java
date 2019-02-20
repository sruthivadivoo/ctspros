package com.cognizant.Mypack2;
import com.cognizant.Mypack1.Emplopyee;
import java.util.ArrayList;
public class EmployeeMaster {
ArrayList<Emplopyee> emp=new ArrayList<Emplopyee>();
public boolean addEmp(Emplopyee e)
{
	if(emp.add(e))
		return true;
	else
		return false;
}
public boolean removeEmp(int id)
{
	int c=0;
	for(int i=0;i<emp.size();i++)
	{
		if(emp.get(i).getId()==id)
		{
			c=1;
			emp.remove(i);
			break;
		}
		}
	if(c==1)
		return true;
		else 
			return false;
}
public boolean getEmpById(int id)
{
	int c=0;
	for(int i=0;i<emp.size();i++)
	{
		if(emp.get(i).getId()==id)
		{
			System.out.println(emp.get(i).getId() + " "+emp.get(i).getName()+" ");
			c++;
			break;
		}
		}
	if(c==1)
		return true;
		else 
			return false;
}
public ArrayList<Emplopyee> getEmp() 
{
	System.out.println(emp);
	return emp;
}
}
