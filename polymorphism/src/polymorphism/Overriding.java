package polymorphism;
class Vehicle{
	void run()
	{
		System.out.println("it is running");
	}
}
class Bike extends Vehicle
{
	void run()
	{
		System.out.println("good ");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
		

	}

}
