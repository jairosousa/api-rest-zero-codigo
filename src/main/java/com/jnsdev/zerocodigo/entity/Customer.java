package com.jnsdev.zerocodigo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 08/03/2026 - 13:03
 */
@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Address> addresses;

    // Set the reference to Customer in the adresses
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
        if (addresses != null) {
            addresses.forEach(address -> address.setCustomer(this));
        }
    }
}
