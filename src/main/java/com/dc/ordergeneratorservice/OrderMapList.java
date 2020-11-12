package com.dc.ordergeneratorservice;

import java.util.HashMap;
import java.util.UUID;

public class OrderMapList {

    public static HashMap<UUID,Order> orderMapr = new HashMap<>();
    
    public OrderMapList(){
    orderMapr = Order.orderMap;

    }


    public HashMap<UUID,Order> getOrderMap(){
        return orderMapr;
    }

    public void setOrderMap(HashMap<UUID,Order> map){
        orderMapr = map;
    }

}