package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {

    private int id;
    private String name;
    private int price;

    public CartItem() {
        super();
    }

    public CartItem(int id,String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
