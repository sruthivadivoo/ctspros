package csort;
import java.util.ArrayList;
import java.util.Collections;

public class TestSortingList {
public static void main(String[] args)
{
	ArrayList<Car1> al=new ArrayList<Car1>();  
	al.add(new Car1(1011,"Scorpio",7));  
	al.add(new Car1(1068,"Indica",3 ));                                                                                                                                                                                                                          
	al.add(new Car1(1058,"Sumo",5));  
	Collections.sort(al);  
	for(Car1 st:al){  
	System.out.println(st.car_no+" "+st.car_name+" "+st.car_price);  
	}  
}
}

