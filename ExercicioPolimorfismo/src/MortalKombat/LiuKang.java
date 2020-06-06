package MortalKombat;

public class LiuKang extends Fighter {
	
	public LiuKang (String name, int life) {
		super(name,life);
	}

	@Override
	public void toPunch(Fighter p) {
		// TODO Auto-generated method stub
		super.toPunch(p);
		p.life -= 2;
	}

	@Override
	public void kick(Fighter p) {
		// TODO Auto-generated method stub
		super.kick(p);
		p.life -=8;
	}

	@Override
	public void magic(Fighter p) {
		// TODO Auto-generated method stub
		super.magic(p);
		p.life -= 15;
	}
	@Override
	public String toString() {
		return "LiuKang";
		
	}	

}
