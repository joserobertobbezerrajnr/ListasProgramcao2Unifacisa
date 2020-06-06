package MortalKombat;

public class Fighter {
	
	protected String name;
	protected int life;
	
	
	public Fighter (String name, int life) {
		this.name = name;
		this.life = life;
	}
	
	public void toPunch (Fighter p) {
		p.life -= 10;
	}
	
	public void kick (Fighter p) {
		p.life -=10;
	}
	public void magic (Fighter p) {
		p.life -=20;
	}
	public void shoot (Fighter p) {
		p.life -=8;
	}
	public void fatality(Fighter p) {
		p.life -=200;
	}
	public void regenerate(Fighter p) {
		p.life += 25;
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	
}
