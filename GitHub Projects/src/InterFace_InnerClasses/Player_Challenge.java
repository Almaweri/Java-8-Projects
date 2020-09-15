package InterFace_InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class Player_Challenge implements ISaveable_Challenge{

	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	public Player_Challenge(String name, int hitPints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String nmam) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player_Challenge [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon="
				+ weapon + "]";
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0, name);
		values.add(1, "" + hitPoints);
		values.add(2, "" + strength);
		values.add(3,  weapon);
		 
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
			name = savedValues.get(0);
			hitPoints = Integer.parseInt(savedValues.get(1));
			strength = Integer.parseInt(savedValues.get(2));
			weapon = savedValues.get(3);
		}
		
	}
	
	
	
	
}
