
public class Method_Overriding {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
	}
}

class Vehicle{
	public void run() {
		System.out.println("Vichale is Running");
	}
}

class Bike extends Vehicle{
	public void run() {
		System.out.println("Bike is Running");
	}
}

