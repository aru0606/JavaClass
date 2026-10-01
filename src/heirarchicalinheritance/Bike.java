package heirarchicalinheritance;

public class Bike extends Vehicle {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.brand="pulser";
		b.speed=90;
		b.start(b.brand,b.speed);
	}
}