package patterns.memento;

record TextWindowsState(String text) {}

public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public String getCurrentText() {
        return currentText.toString();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public TextWindowsState save() {
        return new TextWindowsState(currentText.toString());
    }

    public void restore(TextWindowsState save) {
        currentText = new StringBuilder(save.text());
    }
}

