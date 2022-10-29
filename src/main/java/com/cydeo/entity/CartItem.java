package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class CartItem extends BaseEntity {

    private Integer quantity;
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private Product product;

}
