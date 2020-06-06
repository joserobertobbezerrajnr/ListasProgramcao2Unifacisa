package MortalKombat;

public class SubZero extends Fighter {
	
	public SubZero(String name, int life) {
		super(name, life);
	}

	@Override
	public void toPunch(Fighter p) {
		// TODO Auto-generated method stub
		super.toPunch(p);
		p.life -=10;
	}

	@Override
	public void kick(Fighter p) {
		// TODO Auto-generated method stub
		super.kick(p);
		p.life -=10;
	}

	@Override
	public void magic(Fighter p) {
		// TODO Auto-generated method stub
		super.magic(p);
		p.life -= 27;
	}
	@Override
	public String toString() {
		return "Sub-Zero";
		}
	
}
