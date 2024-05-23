package com.postgresql.Ecommerce.API;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String content;
    private Integer rating;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
