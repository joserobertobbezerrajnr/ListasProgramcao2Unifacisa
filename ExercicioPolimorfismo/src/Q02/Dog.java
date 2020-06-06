package Q02;

public class Dog extends Animal{
	
	public Dog(String name, int age) {
		super(name,age);
	}
	
	public void run() {
		System.out.println("Dog running");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Au au");
	}
}


