package com.dc.ordergeneratorservice;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/orders")
public class OrderRestController {

    

    @GetMapping
    public List<UUID> getOrderList(){
        return OrderList.orderUUIDList;

    }

    @GetMapping("/{orderId}")
    public List<Order> getOrderById(@PathVariable("orderId") UUID orderUuid){
        

       if( OrderList.orderUUIDList.contains(orderUuid)){
           //int index = OrderList.orderUUIDList.indexOf(orderUuid);
           
           return Order.orderList;


       }
       else{
           return null;     //no match found
       }

    }
    
}