
package MainPackage;
import java.util.Scanner;



public class TextEditor {
    Scanner scan = new Scanner(System.in);
    private String text;
    String[] nUndo = new String[10];
    
    int i=1;
    
TextEditor(String text){
    this.text = text;
    
}

public String delete(int n){
if(text.length()>n){
String m = text.substring(0,text.length()-n);

nUndo[i]=text;
i++;
return text=m;
}
else{
return text;
}
}

public String append(String newText){
String appended = text+newText;

nUndo[i]=text;
i++;
return text =appended;
}
    
public void setText(String inText){
    this.text = inText; 
}

public String getText(){
    return text;
}
}
