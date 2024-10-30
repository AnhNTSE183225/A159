package com.theanh.backend.model;

import com.theanh.backend.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Account {

    @Id
    String username;

    String password;

    @Enumerated(EnumType.STRING)
    Role role;

    @OneToMany(mappedBy = "account")
    List<AccountAdmin> admins;

    @OneToMany(mappedBy = "account")
    List<AccountCustomer> customers;

    @OneToMany(mappedBy = "account")
    List<AccountStaff> staffs;
}
