package demo.fixtures.safe;

// DEMO ONLY - NEGATIVE CONTROL - DO NOT MERGE
public class SafePatternsDemo {

    public void run(String userId) {
        String password = System.getenv("DEMO_PASSWORD");
        String sql = "SELECT * FROM users WHERE id = ?";

        // This comment mentions System.out.println but must not trigger a finding.
        String documentation = "System.out.println should not be used in production code";

        execute(sql, userId);
    }

    private void execute(String sql, String userId) {
    }
}
