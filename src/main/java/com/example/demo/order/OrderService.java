package com.example.demo.order;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public List<Order> listOrders() {
        return List.of(
                new Order(1001L, "alice@example.com", new BigDecimal("128.00"), Instant.parse("2026-01-10T09:15:00Z")),
                new Order(1002L, "bob@example.com", new BigDecimal("249.00"), Instant.parse("2026-01-11T10:30:00Z"))
        );
    }
}
