
package Main;
public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;
    private String ageStat;
    
void Student(String firstName, String lastName, int age, boolean isMinor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.isMinor = isMinor;
}
    public String getName(){
        return lastName+", "+firstName;
    }
    
    public void increaseAge(){
    if(age<18){
    age+=1;
    }
    
    if(age<18){
        isMinor = true;
    }
    else{
        isMinor = false;
    }
    
   
    }
    
    @Override
    public String toString(){
    if(isMinor){
    ageStat = "minor";
    }
    else{
    ageStat = "adult";
    }
        return lastName+", "+firstName+" - "+age+" - "+ageStat;
        
    }
    
    
    
    }
    
