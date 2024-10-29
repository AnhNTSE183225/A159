package com.theanh.backend.model;

import com.theanh.backend.model.enums.PriceType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Price {

    @Id
    Integer id;

    Double price;

    @Enumerated(EnumType.STRING)
    PriceType priceType;

    LocalDateTime start;

    LocalDateTime end;

    @ManyToOne
    Product product;
}
