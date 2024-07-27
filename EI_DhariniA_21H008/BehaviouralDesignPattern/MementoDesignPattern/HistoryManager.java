import java.util.Stack;

public class HistoryManager {
    private final Stack<Browser.BrowserHistoryMemento> history = new Stack<>();

    public void save(Browser browser) {
        history.push(browser.createMemento());
    }

    public void undo(Browser browser) {
        if (!history.isEmpty()) {
            browser.restore(history.pop());
        } else {
            System.out.println("No history to go back to.");
        }
    }
}
