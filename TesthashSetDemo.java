package com.cognizant.pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Car
{
	int car_id;
	String car_model;
    double car_price;
	public Car(int car_id, String car_model,  double car_price)
	{
		this.car_id=car_id;
		this.car_model=car_model;
		
		this.car_price=car_price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + car_id;
		result = prime * result + ((car_model == null) ? 0 : car_model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(car_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (car_id != other.car_id)
			return false;
		if (car_model == null) {
			if (other.car_model != null)
				return false;
		} else if (!car_model.equals(other.car_model))
			return false;
		if (Double.doubleToLongBits(car_price) != Double.doubleToLongBits(other.car_price))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", car_model=" + car_model + ",  car_price="
				+ car_price + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}




public class TesthashSetDemo {

	public static void main(String[] args) {
		
HashSet<Car> hs=new HashSet();
//Set<Car> s=new HashSet();
hs.add(new Car(11,"Skoda Laura",500000.00));
hs.add(new Car(2,"Honda Fitta",600000.00));
hs.add(new Car(3,"Ford Pinto",700000.00));
hs.add(new Car(4,"Hyundai Santa Fe",800000.00));
hs.add(new Car(5,"Mitsubishi Pajero",90767600.00));
hs.add(new Car(6,"Toyota MR2",1000000.00));
hs.add(new Car(5,"Mitsubishi Pajero",900000.00));
hs.add(new Car(1,"Skoda Laura",500000.00));
hs.add(new Car(8,null,900000.00));


Iterator<Car> i=hs.iterator();
while(i.hasNext())
{
	Car c=i.next();
	//System.out.println(c.hashCode());
	System.out.println(c.car_id + " "+c.car_model+ " "+c.car_price);
}








	}

}
