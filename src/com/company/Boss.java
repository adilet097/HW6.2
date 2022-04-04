package com.company;

public class Boss extends GameEntity{
    private String weaponBoss;
    private String bossWeapon;

    public String getWeaponBoss() {
        return weaponBoss;

    }
    public void setWeaponBoss(String weaponBoss) {
        this.weaponBoss = weaponBoss;

    }

    public String prinlnInfo() {
        return super.info() + " Weapon: " + this.bossWeapon;
    }

}