package com.example.demo.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    private static final String ADMIN_TOKEN = "ghp_demo_plain_text_token_123456";

    @GetMapping("/admin/search")
    public String searchUsers(@RequestParam String email) throws Exception {
        System.out.println("Admin search email=" + email);

        Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM users WHERE email = '" + email + "' AND token = '" + ADMIN_TOKEN + "'";
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            return resultSet.getString("email");
        }
        return "not found";
    }
}
