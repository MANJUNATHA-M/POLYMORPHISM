package com.runtime.example;

class Animal 
{
	void makeSound()
	{
		System.out.println("TRACKING THE  ANIMAL SOUNDS ");
	}
}


class Dog extends Animal 
{
	@Override
	void makeSound() 
	{
		System.out.println("BOOW! BOOW!");
	}
}


class Cat extends Animal 
{
	@Override
	void makeSound() 
	{
		System.out.println("Meow!");
	}
}

public class RUNTIME_POLYMORPHISM_2ND 
{
	public static void main(String[] args) 
	{
		Animal myAnimal;

		myAnimal = new Dog();
		myAnimal.makeSound(); 

		
		myAnimal = new Cat();
		myAnimal.makeSound(); 

		
		myAnimal = new Animal();
		myAnimal.makeSound(); 
		
	}
}

