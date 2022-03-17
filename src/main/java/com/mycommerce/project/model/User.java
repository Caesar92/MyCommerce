package com.mycommerce.project.model;

import java.util.ArrayList;
import java.util.List;

public class User extends Person{
    List<Product> basket;

    public User(String name) {
        super(name, false);
        this.basket =  new ArrayList<>();
    }

    public User(String name, boolean isValid) {
        super(name, isValid);
        this.basket =  new ArrayList<>();
    }

    public void addProduct(Product p){
        this.basket.add(p);
    }

    public void removeProduct(Product p){
        this.basket.remove(p);
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }
}
