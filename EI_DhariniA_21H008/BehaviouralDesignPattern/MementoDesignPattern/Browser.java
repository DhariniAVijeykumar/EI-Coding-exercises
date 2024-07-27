import java.util.Stack;

public class Browser {
    private String currentPage;

    public void navigateTo(String page) {
        currentPage = page;
        System.out.println("Navigated to: " + currentPage);
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public BrowserHistoryMemento createMemento() {
        return new BrowserHistoryMemento(currentPage);
    }

    public void restore(BrowserHistoryMemento memento) {
        this.currentPage = memento.getPage();
        System.out.println("Restored to: " + currentPage);
    }

    // Memento class to hold the state
    public static class BrowserHistoryMemento {
        private final String page;

        private BrowserHistoryMemento(String page) {
            this.page = page;
        }

        private String getPage() {
            return page;
        }
    }
}
