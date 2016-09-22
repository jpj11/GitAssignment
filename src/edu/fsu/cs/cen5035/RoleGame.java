/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        // Arrow against armor = 20, then no armor
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        armor = 0;
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        // Axe against armor = 20, then no armor
        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage.");
        armor = 20;
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        armor = 0;
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");
    }
}
