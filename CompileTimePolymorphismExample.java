package com.compiletime.example;

public class CompileTimePolymorphismExample
{
	static int add(int a, int b) 
	{
        return a + b;
    }

    static int Multi(int a, int b, int c) 
    {
        return a * b * c;
    }

    static double div(double a, double b) 
    {
        return a / b;
    }

    public static void main(String[] args) 
    {
    	
        int result1 = add(5, 10);
        int result2 = Multi(3, 7, 15);
        double result3 = div(2.5, 3.5);

        System.out.println("Result 1: " + result1); 
        System.out.println("Result 2: " + result2); 
        System.out.println("Result 3: " + result3); 
    }
}

