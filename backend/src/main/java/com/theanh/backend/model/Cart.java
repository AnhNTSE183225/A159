package com.theanh.backend.model;

import com.theanh.backend.model.enums.CartStatus;
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
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Integer totalAmount = 0;

    Double totalPrice = 0.0;

    @Enumerated(EnumType.STRING)
    CartStatus status;

    LocalDateTime created;

    LocalDateTime modified;

    @OneToMany(mappedBy = "cart")
    List<CartItem> items;

    @ManyToOne
    AccountCustomer customer;
}
