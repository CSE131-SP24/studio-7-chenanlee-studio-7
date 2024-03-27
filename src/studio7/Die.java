package studio7;

public class Die {

	private int sides;
	public Die (int sides) {
		this.sides = sides;
	}
	
	public int dieRoll () {
		return (int)(Math.random() * sides) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die = new Die(6);
			System.out.print(die.dieRoll());
	}

}
