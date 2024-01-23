package com.compiletime.example;

public class CompileTimePolymarphism
{
	
	static double add(double ab,double ac)
	{
		return ab + ac;
	}
	
	static long Multi(long bb,long bc)
	{
		return bb + bc;
	}
	
	static int div(int cb,int cc)
	{
		return cb + cc;
	}
	
	static long sub(long db,long dc)
	{
		return db + dc;
	}
	
	
	public static void main(String[] args)
	{
		
	double addresult=add(8023456.00,903454.00);	
	long multiresult=Multi(543234554l,2345432234l);
	int divresult=div(1234,54);
	long subresult=sub(456789876l,98765467l);
	
	 System.out.println("Result 1: " + addresult); 
     System.out.println("Result 2: " + multiresult); 
     System.out.println("Result 3: " + divresult);
     System.out.println("Result 4: " + subresult);
	}

}
