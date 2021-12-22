
public abstract class Vehicle
//private abstract class Vehicle
//final abstract class Vehicle

{            //1.making class as abstract because it contains abstract methods
	abstract void start();                 // only abstract method declaration not implementation
	void display() {
		System.out.println("display non abstract method");   //non abstract method
	}
}
class Car extends Vehicle
{
	void start()                           //providing abstract method implementation
	{
		System.out.println("car start with key");
	}
	}
class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("scooter starts with kick");
	}

	public static void main(String[] args) {
		Scooter s= new Scooter();
		s.start();
		Car c= new Car();
		c.start();
		//Vehical v=new Vehicale()    --cannot instantiate abstract class
				}}
