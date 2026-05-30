package demo.fixtures.database;

// DEMO ONLY - DO NOT MERGE
public class UnsafeSearchDemo {

    public String buildQuery(String userId) {
        return "SELECT * FROM users WHERE id = " + userId;
    }
}
