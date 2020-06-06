package MortalKombat;

import java.util.Random;

public class MortalKombat {
	
	public Fighter a, b;
	
	public MortalKombat(Fighter a, Fighter b) {
		this.a = a;
		this.b= b;
	}
public void fight() {
		
		while(a.getLife() >= 0 && b.getLife() >= 0) {
			
			Fighter playerOne = a;
			Fighter opponent = b;
			Random rand = new Random();
			int drawFighter= rand.nextInt(2);
			
			if (drawFighter == 1) {
				playerOne = b;
				opponent = a;
			}
			
			int drawCoup = rand.nextInt(4);
			
			switch(drawCoup) {
				case 0:
					playerOne.toPunch(opponent);
					System.out.println("\n"+playerOne+" punched  "+opponent);
					break;
				case 1:
					playerOne.kick(opponent);
					System.out.println("\n"+playerOne+" kicked  "+opponent);
					break;
				case 2:
					playerOne.shoot(opponent);
					System.out.println("\n"+playerOne+" shot  "+opponent);
					break;
				case 3:
					playerOne.magic(opponent);
					System.out.println("\n"+playerOne+" cast magic  "+opponent);
					break;
				
			}
			
		}
		
		if (a.life <= 0) {
			System.out.printf("Winner this is %s", b.name);
		} else {
			System.out.printf("Winner this is %s", a.name);
		}
	}
	
}

