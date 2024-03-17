package GleanRoss;

public class TextEditor {
    private String textContent;

    public TextEditor(String initialText) {
        this.textContent = initialText;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String newText) {
        this.textContent = newText;
    }

    public void append(String additionalText) {
        textContent += additionalText;
    }
}
