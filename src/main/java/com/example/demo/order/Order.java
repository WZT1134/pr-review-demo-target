package com.example.demo.order;

import java.math.BigDecimal;
import java.time.Instant;

public record Order(Long id, String customerEmail, BigDecimal total, Instant createdAt) {
}
