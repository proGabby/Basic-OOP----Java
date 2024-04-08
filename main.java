import com.example.game.Enemy;
import com.example.game.GamePlayer;
import com.example.game.ZombieEnemy;

class GameEngine{

    public static void main(String[] args) {
        System.out.println("Hello World");
     

        Enemy enemy1 = new Enemy(3, 10, 5);
        Enemy enemy2 = new Enemy(10, 5, 3);

        ZombieEnemy zombie1 = new ZombieEnemy(  10, 10);

        GamePlayer player1 = new GamePlayer("SwordMan", 2);


        zombie1.stopObjectFromWalking(player1);
        

        System.out.println(enemy1.getLives());
        System.out.println(enemy2.getLives());
        System.out.println(player1.getPlayerLives());

        player1.hitEnemy(enemy1);
        enemy2.fireWeapon();
        player1.hitEnemy(enemy1);
        player1.hitEnemy(enemy1);
        player1.hitEnemy(enemy1);
        player1.hitEnemy(enemy2);
        player1.hitEnemy(enemy2);
        player1.hitEnemy(enemy2);
        player1.hitEnemy(enemy2);
        player1.hitEnemy(enemy2);
        player1.hitEnemy(enemy2);




       
    }
}