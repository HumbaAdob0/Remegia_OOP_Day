
package Main;

public class Character {
    private int health;
    private int damage; 
    private int shield;
    
public Character(int health, int damage, int shield){
this.health = health;
this.damage = damage;
this.shield = shield;
}

public int getHealth(){
    return health;
}
public void setHealth(int hp){
    health=hp;
}

public int getDamage(){
    return damage;
}

public int getShield(){
    return shield;
}

public void receiveDamage(int damage){
health-=damage;
if(health<=0){
System.out.println("Character has died");
}

}
    
}
