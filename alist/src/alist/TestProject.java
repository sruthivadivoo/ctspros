package alist;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;



	class Record
	{
		ArrayList<project> proj=new ArrayList<project>();
		//List<Project> list=new ArrayList<>();
		
		public boolean addProject(project p)
		{
			if(proj.add(p)) {
				return true;
			}
			return false;
		}
		
		public ArrayList<project> getList()
		{
			return proj;
		}
		public void getListById(int id)
		{
		for(int i=0; i<proj.size(); i++)
		{
			if(proj.get(i).getProjectid()==id)
			{
				System.out.println(proj.get(i).getProject_name() + " "+proj.get(i).getProject_location());
			}
		}
		}
		public boolean removeListById(int id)
		{
			return false;// This method remove the list
		}
		public int updateListById(int id)
		{
			return 1;//It will return 1 after sucessfully updation of arraylist or 0 for failure
			
		}
		
		
		
	}
	public class TestProject {
		public static void main(String[] args) throws NumberFormatException, IOException
		{
			Record r=new Record();
			boolean b=false;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("How many projects do you want to add");
			int no_of_project=Integer.parseInt(br.readLine());
			for(int i=0; i<no_of_project; i++)
			{
				project p=new project();
				System.out.println("Enter project id");
				int id=Integer.parseInt(br.readLine());
				p.setProjectid(id);
				System.out.println("Enter project name");
				String pname=br.readLine();
				p.setProject_name(pname);
				System.out.println("Enter project location");
				String plocation=br.readLine();
				p.setProject_location(plocation);
				
				System.out.println("Enter project type");
				String ptype=br.readLine();
				p.setProject_type(ptype);
			b=	r.addProject(p);
				
				
				
			}
			ArrayList<project> list_project=r.getList();
			if(b)
			{
				Iterator<project> iterator=list_project.iterator();
				while(iterator.hasNext())
				{
					project p=iterator.next();
					System.out.println(p);
					System.out.println(p.getProjectid() + "  "+p.getProject_name()+" "+p.getProject_location()+" "+p.getProject_type());
					
					
					
					
				}
				
				System.out.println("Enter the id to search");
				int id=Integer.parseInt(br.readLine());
				r.getListById(id);
				
			}
			
			
			
		}

	}

