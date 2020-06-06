package Q02;

public class Sloth extends Animal{
	
	public Sloth(String name, int age) {
		super(name, age);
	}
	public void climbATree() {
		System.out.println("No");
	}
	@Override
	public void makeSound() {
		System.out.println("ZZzzzzZZZZzzzz");
	}

}
