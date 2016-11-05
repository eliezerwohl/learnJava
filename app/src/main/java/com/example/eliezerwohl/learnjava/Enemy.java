package com.example.eliezerwohl.learnjava;

/**
 * Created by Elie on 11/4/2016.
 */

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }
    public void takeDamage(int damage){
        int remainingHitPoints = this.hitPoints - damage;
        if (remainingHitPoints > 0 ){
            setHitPoints(remainingHitPoints);
            System.out.println("I took " + damage + "points damage and have " + remainingHitPoints + " left");
        }else{
            this.lives = this.lives - 1;
            System.out.println("I have lost a life");
            if (this.lives < 1 ) {
                System.out.println("I Have no more lives");
            }else{
                System.out.println("but i continue to fight on!");
            }
        }
    }

    public void showInfo(){
        System.out.println("Name: " + this.name + " Hitpoint: " + this.hitPoints + " :Lives: " + this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
