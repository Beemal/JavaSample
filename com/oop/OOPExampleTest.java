package com.oop;

class Shape{
	int count = 1;
	void print(){
		System.out.println("Shape");
	}
}
class Circle extends Shape{
	int count = 3;
	
	@Override
	void print(){
		System.out.println("Circle");
	}
}
public class OOPExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle();
		s.print();
		System.out.println(s.count); // only methods are overridden not instance
		
		System.out.println(new Circle().count); 
		// instance variable has nothing to do with overriding 
	}

}
