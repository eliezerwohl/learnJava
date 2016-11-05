package com.example.eliezerwohl.learnjava;

/**
 * Created by Elie on 11/5/2016.
 */

public class Vampire  extends Enemy {
    public Vampire(String name) {
        super(name, 20, 3);
    }
    @Override
    public void takeDamage(int damage) {
        int damageDone = (damage/2);
        //half damage
        super.takeDamage(damageDone);
    }
}
