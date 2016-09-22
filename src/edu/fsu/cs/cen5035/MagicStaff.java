package edu.fsu.cs.cen5035;

/**
*
* @author Patrick
*/
public class MagicStaff extends BasicWeapon implements Weapon {

	public MagicStaff() {
		super(80);
	}

	public int hit() {
		return DAMAGE;
	}
	
	public int hit(int armor) {
		// MagicStaff reduces effect of armor by 20%
		int damage = (int) (DAMAGE - (armor * 0.8));
		
		// Ensure damage is positive
		if (damage < 0) {
			return 0;
		}
		return damage;
	}
}
