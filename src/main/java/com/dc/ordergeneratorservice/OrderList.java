package com.dc.ordergeneratorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderList {

    public static List<UUID> orderUUIDList = new ArrayList<>();




    public OrderList() {
    }

    public List<UUID> getOrderUUIDList(){
        return orderUUIDList;
    }

    
}

//Make all the members and functions of the class static - Since the class cannot be instantiated no instance methods can be called or instance fields accessed

