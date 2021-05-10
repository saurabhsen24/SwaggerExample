package com.example.demo.controller;

import com.example.demo.model.CartItem;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/get")
    public List<CartItem> getCartDetails(){
        System.out.println("Get Carts");
        return cartService.getCartDetails();
    }

    @PostMapping("/add")
    public int addCartDetails(@RequestBody CartItem cartItem){
        return cartService.addCartDetails(cartItem);
    }

    @PutMapping("/update")
    public int updateCartDetails(@RequestBody CartItem cartItem){
        return cartService.updateCartDetails(cartItem);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteCartDetails(@PathVariable int id){
        return cartService.deleteCartDetails(id);
    }

}
