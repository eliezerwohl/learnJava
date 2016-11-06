package com.example.eliezerwohl.learnjava;

/**
 * Created by Elie on 11/6/2016.
 */

public class VampireKing extends Vampire {
    public VampireKing(String name) {
        super(name);
        super.setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }
}
