class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState currentState;
    private int maxHistorySize = 10;
    private int historyCount = 0;

    public void type(String content) {
        TextState newState = new TextState(content);

        if (currentState != null) {
            newState.prev = currentState;
            currentState.next = newState;
        }

        currentState = newState;
        historyCount++;

        // Limit the history size
        if (historyCount > maxHistorySize) {
            removeOldestState();
        }

        System.out.println("Typed: " + content);
    }

    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.content);
        } else {
            System.out.println("No more undo actions available.");
        }
    }

    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.content);
        } else {
            System.out.println("No more redo actions available.");
        }
    }

    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current State: " + currentState.content);
        } else {
            System.out.println("No content available.");
        }
    }

    private void removeOldestState() {
        TextState temp = currentState;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        if (temp.next != null) {
            temp.next.prev = null;
        }
        historyCount--;
    }
}

public class TextEditorDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Typing text
        editor.type("Hello");
        editor.type("Hello, World!");
        editor.type("Hello, World! This is an editor.");
        editor.displayCurrentState();

        // Undo actions
        editor.undo();
        editor.undo();
        editor.displayCurrentState();

        // Redo actions
        editor.redo();
        editor.displayCurrentState();

        // More typing after undo (overwrites redo history)
        editor.type("New sentence after undo.");
        editor.displayCurrentState();

        // Undo after new change
        editor.undo();
        editor.displayCurrentState();
    }
}
