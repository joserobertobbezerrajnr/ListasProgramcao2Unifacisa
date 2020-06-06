package Q02;

public class Horse extends Animal {
	public Horse (String name, int age) {
		super(name, age);
	}
	public void trottingHorse() {
		System.out.println("trotting horse");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Innnririririri");
	}

}
