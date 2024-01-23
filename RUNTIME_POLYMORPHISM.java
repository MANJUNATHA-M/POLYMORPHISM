package com.runtime.example;

interface OrderFood
{
	public void order();
}

class Veg implements OrderFood
{
	public void order()
	{
		System.out.println(" Idli is Ordered ");
	}
}

class NonVeg implements OrderFood
{
	public void order()
	{
		System.out.println("Biryani is Ordered ");
	}
}

public class RUNTIME_POLYMORPHISM {
	
	
	public static void main(String[] args)
	{
		OrderFood orderfood;
		
		System.out.println("");
		orderfood=new Veg();
		orderfood.order();
		System.out.println("");
		
		System.out.println("");
		orderfood=new NonVeg();
		orderfood.order();
		
	}

}
