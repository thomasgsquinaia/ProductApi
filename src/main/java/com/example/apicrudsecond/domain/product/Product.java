package com.example.apicrudsecond.domain.product;

import jakarta.persistence.*;
import lombok.*;

import java.awt.datatransfer.FlavorEvent;

@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Product {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Float price;

    private Boolean active;

    public Product(RequestProduct registerProduct) {
        this.name = registerProduct.name();
        this.price = registerProduct.price();
        this.active = true;
    }

}
