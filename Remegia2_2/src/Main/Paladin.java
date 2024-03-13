
package Main;

public class Paladin extends Swordsman{
    private boolean hasResurrected = false;
    private int health,damage,shield;
    
public Paladin(boolean hasResurrected, int health, int damage, int shield){
    super(health, damage, shield);
    this.health = health;
    this.damage = damage;
    this.shield = shield;
    this.hasResurrected = hasResurrected;
    
    
    
}
@Override
public void receiveDamage(int damage){
if(damage%2==0){
damage/=2;
shield=-damage;
super.receiveDamage(damage);
}
}

public void resurrect(){
    if(hasResurrected==false){
    hasResurrected = true;
    setHealth(100);
    }
    else{
    System.out.println("Paladin has died");
    }
    }
    
}
