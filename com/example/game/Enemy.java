package com.example.game;


public class Enemy {
    private int lives;
    protected int hitPoints;
    public int speed;

   public Enemy(int inputLives, int inputHitPoints, int inputSpeed){
    this.lives = inputLives;
    this.hitPoints = inputHitPoints;
    this.speed = inputSpeed;
   }


    public int  getLives(){
        //if the user role is not admin return 0
        return lives;
    }


    public void fireWeapon(){
        System.out.println("Enemy fires weapon");
    }

    //method overloading ---> polymorphism
    public void fireWeapon(String weaponName){
        System.out.println("Enemy fires weapon with name " + weaponName);
    }

    public void reduceLive(int playerWeaponStrength){
        this.lives -= playerWeaponStrength;
        if(this.lives < 0){
            die();
        }
    }

    
    public void die(){
        this.lives = 0;
        this.speed = 0;
        this.hitPoints = 0;
        System.out.println("Enemy dies");
    }


}

