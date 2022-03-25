package patterns.memento;

public class TextEditor {

    private TextWindow textWindow;
    private TextWindowsState savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getCurrentText();
    }

    public void pressSave() {
        savedTextWindow = textWindow.save();
    }

    public void pressUndo() {
        textWindow.restore(savedTextWindow);
    }
}
