package heirarchicalinheritance;

public class Truck extends Vehicle{
	public static void main(String[] args) {
		Truck t=new Truck();
		t.brand="ashok leyland";
		t.speed=70;
		t.start(t.brand,t.speed);
	}
}
