package demo.fixtures.logging;

// DEMO ONLY - DO NOT MERGE
public class SilentFailureDemo {

    public void run() {
        try {
            execute();
        } catch (RuntimeException exception) {
        }

        System.out.println("demo output");
    }

    private void execute() {
    }
}
