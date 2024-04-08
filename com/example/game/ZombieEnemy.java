package com.example.game;

public class ZombieEnemy extends Enemy{

    private int specialWeaponStrength;
    private int specialLive;

    public ZombieEnemy(int inputLives, int inputHitPoints) {
        //initializing parent constructor using super keyword
        super(inputLives, inputHitPoints, 20);

        //initializing child class properties
        this.specialWeaponStrength = 30;
        this.specialLive = 30;
        
        
    }

    /* 
    The Walkable Abrastion is being use here. 
    This method calls the walkAround method from the Walkable interface without knowing the implementation details.
    Hence, the implementation details can be changed without affecting the calling method.
    */
    public void stopObjectFromWalking(Walkable wlk){
        wlk.walkAround();
    }

    //method overriding ---> polymorphism
    @Override
    public void reduceLive(int playerWeaponStrength){

        if( playerWeaponStrength % 2 == 0){

            this.specialLive -= playerWeaponStrength;
        }
        
        if(this.specialLive < 0){
            die();
        }
    }

    //method overriding ---> polymorphism
    @Override
    public void die(){
        this.specialLive = 0;
        this.specialWeaponStrength = 0;
        this.speed = 0;
        this.hitPoints = 0;
        System.out.println("Enemy dies");
    }
    
}
