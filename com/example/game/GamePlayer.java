package com.example.game;

//Creating layer of abstraction using interface
interface Walkable{
    public void walkAround();
}


//GamePlayer class implements Walkable interface
public class GamePlayer implements Walkable{
    private int lives;
    private int weaponStrength;

    public String name;
    public int score;

    public GamePlayer(String name, int wpStrength){
        this.name = name;
        this.lives = 10;
        this.score = 0;
        this.weaponStrength = wpStrength;
    }

    public void setName(String name){
        this.name = name;
    }

    public int  getPlayerLives (){
        return lives;
    }

    public void hitEnemy(Enemy em){
        em.reduceLive(this.weaponStrength);
        this.score += 1;
        System.out.println("I have hit enemy by " + this.weaponStrength);
    }

    public void rechargeLife(){
        this.lives = 10;
    }

    //walkAround method from Walkable interface is being implemented. ----> another form of polymorphism
    public void walkAround(){
        System.out.println("Game player is walking around");
    }



}
