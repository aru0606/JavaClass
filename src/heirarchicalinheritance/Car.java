package heirarchicalinheritance;

public class Car extends Vehicle{
 
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="audi";
		c.speed=120;
		c.start(c.brand,c.speed);
	}
}
