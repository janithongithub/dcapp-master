package com.dc.workerservice;

import org.springframework.web.client.RestTemplate;

public class WBRestTemplate {

    RestTemplate restTemplate =new RestTemplate();


    public void getOrderWorkerMap(){
        

        OrderWorkerMap orderWorkerMap = restTemplate.getForObject("http://localhost:8080/internal/ordermap", OrderWorkerMap.class);
        System.out.println(orderWorkerMap);
        System.out.println(OrderWorkerMap.orderWorkerMap);
        
    }
/*
    public void getAllOrders(){
        

        OrderMapList orderMapList = restTemplate.getForObject("http://localhost:8080/internal/orders/allorders", OrderMapList.class);
        System.out.println(orderMapList);
        System.out.println(OrderMapList.orderMapr);
        
    }
  */  
}