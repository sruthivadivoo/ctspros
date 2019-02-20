package csort;
import java.util.ArrayList;
import java.util.Collections;

public class TestPlayer {

	public static void main(String[] args) {
	
		
		
		
		
		ArrayList<Player> al=new ArrayList<Player>();  
		al.add(new Player(25,"Virat",100));  
		al.add(new Player(21,"Murli",150));  
		al.add(new Player(20,"Ankit",76));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		for(Player p: al){  
		System.out.println(p.age+" "+p.palyer_name+" "+p.palyer_score);  
		}  
		  
		System.out.println("Sorting by score");  
		  
		Collections.sort(al,new ScroeComparator());  
		for(Player p: al){  
		System.out.println(p.age+" "+p.palyer_name+" "+p.palyer_score);  
		}  
		

	}

}