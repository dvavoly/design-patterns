package patterns.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("Create new project.");
        textEditor.write("\nVersion 1.0");
        textEditor.write("\nSaving current version");
        textEditor.pressSave();
        System.out.println(textEditor.print());
        textEditor.write("\nVersion 1.1");
        System.out.println();
        System.out.println(textEditor.print());
        textEditor.pressUndo();
        System.out.println();
        System.out.println(textEditor.print());
    }
}
