package com.example.demo.catalog;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
    public List<CatalogItem> listCatalog() {
        return List.of(
                new CatalogItem("KB-001", "Mechanical Keyboard", "accessories", 14),
                new CatalogItem("MS-002", "Wireless Mouse", "accessories", 21),
                new CatalogItem("MN-003", "Office Monitor", "display", 7)
        );
    }
}
