package com.example.eliezerwohl.learnjava;

import java.util.ArrayList;
import java.util.SortedMap;

/**
 * Created by Elie on 11/4/2016.
 */

public class Demo {
    public static void main(String[] args) {
        Player conan = new Player ("Conan");
        conan.pickUpLoot(new Loot("Invisiblity", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of Speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.showInventory();
        System.out.println("final tally1: " + conan.score());
        conan.dropLoot("Cursed Shield");
        conan.showInventory();
        System.out.println("final tally: " + conan.score());

    }
//        Troll uglyTroll = new Troll("Ugly troll");
//        uglyTroll.showInfo();
//        uglyTroll.takeDamage(30);
//        Vampire vlad = new Vampire("Vlad");
//        vlad.showInfo();
//        vlad.takeDamage(24);
//        vlad.showInfo();


;
//        for (int i = 0; i < 10; i++){
//            VampireKing king = new VampireKing("King");
//
//            king.setLives(0);
//        king.showInfo();
//
//           do {
//                if (king.dodges()) {
//                    king.setLives(king.getLives() + 1);
//                    continue;
//                }
//                if (king.runAway()) {
//                    System.out.println("he ran away");
//                    break;
//                } else {
//                    king.takeDamage(80);
//                    king.showInfo();
//                }
//
//
//        }while (king.getLives()>0);
//
//    }
//}
//    public static void main(String[] args) {
//        Enemy enemy = new Enemy ("Testing", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(10);
//    }
//    public static void main(String[] args) {
//        Player tim = new Player("tom smith", 3);
////
////        System.out.println(tim.getHandleName() + " has this many lives : " + tim.getLives());
////        System.out.println("is on this level: " + tim.getLevel());
////        System.out.println("his starting weapon is: " + tim.getWeapon().getName().toLowerCase());
//
//        Weapon myAxe = new Weapon ("Goldshine Axe", 15, 50);
//        tim.setWeapon(myAxe);
//        System.out.println("his new weapon is: " + tim.getWeapon().getName());
//        Loot redPotion = new Loot ("red potion", LootType.POTION, 7);
//        tim.pickUpLoot(redPotion);
//        tim.pickUpLoot( new Loot ("+3 chest armor", LootType.POTION, 80));
//        tim.pickUpLoot( (new Loot ("Ring of protectoin", LootType.RING, 50)));
//
//        tim.showIventory();
////        Loot bluePotion = new Loot("Blue potion", LootType.POTION, 6);
//        boolean wasDeleted = tim.dropLoot(redPotion);
//        System.out.println(wasDeleted);
//        tim.showIventory();
//
    }

