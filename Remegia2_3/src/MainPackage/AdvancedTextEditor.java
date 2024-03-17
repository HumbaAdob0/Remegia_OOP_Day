package MainPackage;

public class AdvancedTextEditor extends TextEditor{

    public AdvancedTextEditor(String text) {
        super(text);
        
    }
    //AdvancedTextEditor u = new AdvancedTextEditor();
    
    public void undo(){
    i--;
        setText(nUndo[i]);
    }
    
    public void print(){
    System.out.println(getText());
    }
    
}
