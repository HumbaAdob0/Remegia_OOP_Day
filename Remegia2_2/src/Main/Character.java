
package Main;


public class Character {

    
    private int damage, shield, health;
    
    
    public Character (int health, int damage, int shield){
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }
    
    //Getter
    int getHealth(){
        return health;
    }
    int getDamage(){
        return damage;
    }
    int getShield(){
        return shield;
    }
    //Setter
    void setHealth(int hp){
        health = hp;
    }
    //Method
    public void receiveDamage(int damage){
        health -= damage + shield;
        if (health <= 0){
            System.out.println("Character has died");
        }
    }
    public static void testFieldPrivacy (Character character){
        Class<?> clazz = character.getClass();
        java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
        boolean allFieldsPrivate = true;
        
        for (java.lang.reflect.Field field : fields){
            if (!java.lang.reflect.Modifier.isPrivate(field.getModifiers())) {
                allFieldsPrivate = false;
                System.out.println("Field '" + field.getName() + "' is not private");
            }
        }
        if (allFieldsPrivate){
            System.out.println("All fields are private");
        } else {
            System.out.println("Not all fields are private");
        }
        
    }
    
}
