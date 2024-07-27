public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();
        HistoryManager historyManager = new HistoryManager();

        // Navigate to different pages
        browser.navigateTo("Homepage");
        historyManager.save(browser);

        browser.navigateTo("About Us");
        historyManager.save(browser);

        browser.navigateTo("Contact");
        System.out.println("Current Page: " + browser.getCurrentPage());

        // Go back to previous pages
        historyManager.undo(browser);
        System.out.println("After Undo: " + browser.getCurrentPage());

        historyManager.undo(browser);
        System.out.println("After Undo: " + browser.getCurrentPage());
    }
}
