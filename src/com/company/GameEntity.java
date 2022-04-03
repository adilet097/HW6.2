package com.company;

public class GameEntity {
    private int Health;
    private int Damage;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int Health) {
        this.Health = Health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        this.Damage = Damage;
    }

    public String info() {
        return "Health: " + this.Health + " Damage: " + this.Damage;
    }
}