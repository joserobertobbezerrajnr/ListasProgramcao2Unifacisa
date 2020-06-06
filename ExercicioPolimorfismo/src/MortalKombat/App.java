package MortalKombat;

public class App {

	public static void main(String[] args) {
		
		Fighter player = new SubZero("José", 100);
		Fighter playerTwo = new Scorpion("Roberto", 100);
		
		MortalKombat mK = new MortalKombat(player, playerTwo);
		mK.fight();
		
	}

}
