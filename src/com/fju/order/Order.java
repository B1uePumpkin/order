package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;


    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        shipFeed=this.delivery.price;
    }
    public int total(){
        if (delivery instanceof ShopeeDelivery){
            if (amount>=199){
                return amount;
            }
        }
        return amount + delivery.price;
    }
}
