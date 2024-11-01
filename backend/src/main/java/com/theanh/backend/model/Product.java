package com.theanh.backend.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String description;

    Double singlePrice;

    String category;

    Integer stockQuantity;

    LocalDateTime created;

    LocalDateTime modified;

    @OneToMany(mappedBy = "product")
    List<CartItem> cartItems;
}
