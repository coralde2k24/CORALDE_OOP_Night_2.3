package GleanRoss;


public class PrintTextEditor extends TextEditor {
    
    public PrintTextEditor(String initialText) {
        super(initialText);
    }

    
    public void displayTextContent() {
        System.out.println(getTextContent());
    }
}