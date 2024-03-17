package GleanRoss;

public class AdvancedTextEditor extends TextEditor {
    
    public AdvancedTextEditor(String initialText) {
        super(initialText);
    }

    
    public void addTextContent(String additionalText) {
        setTextContent(getTextContent() + additionalText);
    }

    public void removeCharacters(int numCharsToRemove) {
        if (numCharsToRemove <= getTextContent().length()) {
            setTextContent(getTextContent().substring(0, getTextContent().length() - numCharsToRemove));
        }
    }
}
