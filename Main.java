package GleanRoss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();

       
        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();

        
        TextEditor editor;
        if (editorType == 1) {
            editor = new PrintTextEditor(initialText);
        } else if (editorType == 2) {
            editor = new AdvancedTextEditor(initialText);
        } else {
            System.out.println("Invalid editor type. Exiting...");
            return;
        }

       
        System.out.print("Enter code: ");
        int code = scanner.nextInt();

        
        if (code == 1) {
            System.out.println("SUCCESS");
        } else if (code == 2 && editor instanceof PrintTextEditor) {
            ((PrintTextEditor) editor).displayTextContent();
            System.out.println("New Text");
            System.out.println("SUCCESS");
        } else {
            System.out.println("Invalid code. Exiting...");
            return;
        }
    }
}
