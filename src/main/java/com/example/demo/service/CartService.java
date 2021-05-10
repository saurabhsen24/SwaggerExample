package com.example.demo.service;

import com.example.demo.dao.CartRepository;
import com.example.demo.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<CartItem> getCartDetails(){
        return cartRepository.getCartDetails();
    }

    public int addCartDetails(CartItem cartItem){
        return cartRepository.addCartDetails(cartItem);
    }

    public int updateCartDetails(CartItem cartItem){
        return cartRepository.updateCartDetails(cartItem);
    }

    public int deleteCartDetails(int id){
        return cartRepository.deleteCartDetails(id);
    }
}
