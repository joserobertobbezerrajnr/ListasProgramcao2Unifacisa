package MortalKombat;

public class Jax extends Fighter {
	
	public Jax(String name, int life) {
		super(name,life);
	}
	
	@Override
	public void toPunch(Fighter p) {
		super.toPunch(p);
		p.life -= 5;
	}
	@Override
	public void regenerate(Fighter p) {
		// TODO Auto-generated method stub
		super.regenerate(p);
	}

	
	@Override
	public String toString() {
		return "Jax";
		
	}
}
