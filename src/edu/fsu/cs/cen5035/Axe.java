package edu.fsu.cs.cen5035;

/**
*
* @author Patrick
*/
public class Axe extends BasicWeapon implements Weapon {

	public Axe() {
		super(60);
	}

	public int hit() {
		return DAMAGE;
	}
	
	public int hit(int armor) {
		int damage;
		// If 0 < armor < 20, then armor has no effect
		if (armor > 0 && armor < 20) {
			damage = DAMAGE;
		}
		// Otherwise armor has full effect
		else {
			damage = DAMAGE - armor;
		}
		// Ensure damage is positive
		if (damage < 0) {
			return 0;
		}
		return damage;
	}
}
