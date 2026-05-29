package com.example.demo.support;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SupportService {
    public List<SupportTicket> listTickets() {
        return List.of(
                new SupportTicket(501L, "Keyboard replacement", "open"),
                new SupportTicket(502L, "Invoice copy", "closed")
        );
    }
}
