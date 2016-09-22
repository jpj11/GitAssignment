package edu.fsu.cs.cen5035;

/**
 *
 * @author Patrick
 */
public class Arrow extends BasicWeapon implements Weapon {

	public Arrow() {
		super(70);
	}
	
	public int hit() {
		return DAMAGE;
	}
	
	public int hit(int armor) {
		int damage;
		// If armor is greater that five, account for arrow bonus
		if (armor >= 5) {
			damage = DAMAGE - armor + 5;
		}
		// If armor is less than five, then it has no effect
		else {
			damage = DAMAGE;
		}
		// Ensure damage is positive
		if (damage < 0) {
			return 0;
		}
		return damage;
	}

}
