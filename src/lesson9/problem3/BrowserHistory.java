package lesson9.problem3;

import java.util.Stack;

public class BrowserHistory {
    String currentUrl;
    Stack<String> backStack;
    Stack<String> forwardStack;

    public BrowserHistory(String url) {
        this.currentUrl = url;
        backStack = new Stack<>();
        forwardStack = new Stack<>();
    }

    public void visit(String url) {
        backStack.push(currentUrl);
        forwardStack.clear();
        currentUrl = url;
        System.out.println("Visited: " + currentUrl);
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }
        forwardStack.push(currentUrl);
        currentUrl = backStack.pop();
        System.out.println("Back to: " + currentUrl);
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward history.");
            return;
        }
        backStack.push(currentUrl);
        currentUrl = forwardStack.pop();
        System.out.println("Forward to: " + currentUrl);
    }

    @Override
    public String toString() {
        return "BrowserHistory{" +
                "currentUrl='" + currentUrl + '\'' +
                ", backStack=" + backStack +
                ", forwardStack=" + forwardStack +
                '}';
    }
}
