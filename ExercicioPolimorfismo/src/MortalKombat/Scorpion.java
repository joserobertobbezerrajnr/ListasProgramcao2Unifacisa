package MortalKombat;

public class Scorpion extends Fighter {
	
	public Scorpion(String name, int life) {
		super(name, life);
	}

	@Override
	public void toPunch(Fighter p) {
		// TODO Auto-generated method stub
		super.toPunch(p);
		p.life -= 27;
	}

	@Override
	public void kick(Fighter p) {
		// TODO Auto-generated method stub
		super.kick(p);
		p.life -= 27;
	}

	@Override
	public void magic(Fighter p) {
		// TODO Auto-generated method stub
		super.magic(p);
		p.life -= 50;
	}

	@Override
	public void fatality(Fighter p) {
		// TODO Auto-generated method stub
		super.fatality(p);
		p.life -= 207;
	}

	@Override
	public void regenerate(Fighter p) {
		// TODO Auto-generated method stub
		super.regenerate(p);
		p.life += 270;
	}
	@Override
	public String toString() {
		return "Scorpion";
		}

}
