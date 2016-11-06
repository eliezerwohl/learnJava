package com.example.eliezerwohl.learnjava;

import java.util.Random;

/**
 * Created by Elie on 11/6/2016.
 */

public class VampireKing extends Vampire {
    public VampireKing(String name) {
        super(name);
        super.setHitPoints(140);
    }
    public boolean dodges(){
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if (chance > 3){
            System.out.println("king dodges");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean runAway(){
//        if (getLives()<2){
//            return true;
//        }
//        else {
//            return false;
//        }
        return (getLives() < 2);

    }
    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }
}
