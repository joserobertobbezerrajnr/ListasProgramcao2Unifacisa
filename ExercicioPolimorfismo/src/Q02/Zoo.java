package Q02;


public class Zoo {
	
	public static void main (String[] args) {
		Animal[] cages = new Animal[5];
		
		Dog golden = new Dog("Golden", 8);
		cages[0] = golden;
		
		Dog mongrel = new Dog("Mongrel Dog",3);
		cages[1] = mongrel;
		
		Sloth juaaaao = new Sloth("juaaaao", 99);
		cages[2] = juaaaao;
		
		Horse xico = new Horse("Xico", 10);
		cages[3] = xico;
		
		Horse berg = new Horse("Corre berg", 8);
		cages[4] = berg;
		
		for (int i = 0; i<cages.length; i++) {
			cages[i].makeSound();
			if(cages[i] instanceof Sloth) {
				((Sloth)cages[i]).climbATree();
			}
			else if (cages[i] instanceof Dog) {
				((Dog) cages[i]).run();
			}
			else if (cages[i]instanceof Horse) {
				((Horse)cages[i]).trottingHorse();
			}
			
		}
	
	}

}
