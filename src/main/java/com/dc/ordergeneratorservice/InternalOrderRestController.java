package com.dc.ordergeneratorservice;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/orders")
public class InternalOrderRestController {

    @GetMapping(produces  = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody OrderList getOrderUUIDList() {
        return new OrderList();
        //returning orderlist class

    }

    /*
    @GetMapping(value = "allorders", produces  = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody OrderMapList getAllOrders(){

        return new OrderMapList();
    }
*/
    
}












