package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeaponBoss("Sword of death");
        System.out.println("Boss Health: " + boss.getHealth() + " Boss Damage: " + boss.getDamage() + " Boss weapon: "
                + boss.getWeaponBoss());
        boss.setWeaponBoss("Sword of death");

        System.out.println();

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(250);
        skeleton.setDamage(20);
        skeleton.setNumberOfImpact(30);
        System.out.println("Skeleton health: " + skeleton.getHealth() + " Skeleton Damage: " + skeleton.getDamage() +
                " " + "Skeleton Impact:" + skeleton.getNumberOfImpact());

        System.out.println();

            Skeleton skeleton1 = new Skeleton();
            skeleton1.setHealth(300);
            skeleton1.setDamage(30);
            skeleton1.setNumberOfImpact(20);
            System.out.println("Skeleton health 1: " + skeleton.getHealth() + "Skeleton Damage1: " + skeleton.getDamage() +
                    " " + "Skeleton Impact1: " + skeleton.getNumberOfImpact());

        System.out.println();

            System.out.println(boss.prinlnInfo());
            System.out.println(skeleton.printlnInfo());
        }
    }

