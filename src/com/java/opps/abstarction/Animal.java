package com.java.opps.abstarction;

abstract class Animal {
       abstract void  makesSound();
       abstract void eat();
       
       public void sleeping() {
    	   System.out.println("Sleeping");
       }
}

	

abstract class Dog extends Animal{
	public void makesSound() {
		System.out.println("barking");
	}
}

class Demo extends Dog{
	public void eat(){
		System.out.println("eat dog biscuits");
	}
}

 
class Cat extends Animal{
	public void makesSound() {
		System.out.println("meow");
	}
	public void eat() {
		System.out.println("cat eats rats");
	}
}

