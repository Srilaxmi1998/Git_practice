package java;

public class Car {
Car(){
	System.out.println("i am in car constructor");
}
	public static void main(String[] args) {
		System.out.println("I am in Car main method");
		Car car=new Car();
	}
static {
	System.out.println("I am in Car static-block method");
}
 {
	System.out.println("I am in Car non_static-block method");
}
 void speed() {
	 System.out.println("speed");
 }
}
