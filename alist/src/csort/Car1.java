package csort;
class Car1 implements Comparable<Car1>{  
int car_no;  
String car_name;  
int car_price;  
Car1(int car_no,String car_name,int car_price){  
this.car_no=car_no;  
this.car_name=car_name;  
this.car_price=car_price;  
}  
  
public int compareTo(Car1 cs){ 
	System.out.println(car_price+" "+cs.car_price);
	System.out.println(car_price-cs.car_price);
  return car_price-cs.car_price;
}  
}  
