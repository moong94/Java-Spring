package ch06;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("move");
	}
	public void eating() {
		System.out.println("Eating");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("Human move");
	}
	
	public void readBook() {
		System.out.println("Read Book");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("Tiger move");
	}
	
	public void hunting() {
		System.out.println("Tiger Hunting");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("Fly");
	}
	
	public void flying() {
		System.out.println("Flying");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
			animal.eating();
		}
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
}
