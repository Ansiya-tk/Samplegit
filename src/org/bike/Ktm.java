package org.bike;

public class Ktm implements Bike,check2{

	@Override
	public void cost() {
	System.out.println("The cost of bike is 20000");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed is 180");
		
	}
	

	@Override
	public void distance() {
		System.out.println("Distance covered : 3000");
		
	}
	
	public static void main(String[] args)
	{
		Ktm k=new Ktm();
		k.cost();
		k.speed();
		k.distance();
	}

}
