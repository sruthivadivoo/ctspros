package csort;
import java.util.Comparator;

public class Player  {
	int age;
	String palyer_name;
	int palyer_score;
	public Player(int age, String palyer_name, int palyer_score) {
		super();
		this.age = age;
		this.palyer_name = palyer_name;
		this.palyer_score = palyer_score;
	}
}
class ScroeComparator implements Comparator<Player>
{
	@Override
	public int compare(Player p1, Player p2) {
		if(p1.palyer_score==p2.palyer_score)
		return 0;
		else if(p1.palyer_score<p2.palyer_score)
		{
			return 1;
		}
		else
		{
		return -1;	
		}
	}
	
}

class NameComparator implements Comparator<Player>
{
	@Override
	public int compare(Player p1, Player p2) {
		 return p1.palyer_name.compareTo(p2.palyer_name);
	}
	
}