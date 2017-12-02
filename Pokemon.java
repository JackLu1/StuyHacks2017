public class Pokemon{
	private String name;
	private int health;
	private int attack;
	private int defense;
	private int specialAtk;
	private int specialDef;
	private int speed;

	public Pokemon( String nameParam, int hp, int atk, int def, int spAtkParam, int spDefParam, int spd){
		name = nameParam;
		health = hp;
		attack = atk;
		defense = def;
		specialAtk = spAtkParam;
		specialDef = spDefParam;
		speed = spd;
	}

	public String toString(){
		return			"Name: " + name + System.lineSeparator()		
							+ "Health: " + health + System.lineSeparator()
							+ "Attack: " + attack + System.lineSeparator()
							+ "Defense: " + defense + System.lineSeparator()
							+ "Special Attack: " + specialAtk + System.lineSeparator()
							+ "Special Defense: " + specialDef + System.lineSeparator()
							+ "Speed: " + speed
							;
	}
}