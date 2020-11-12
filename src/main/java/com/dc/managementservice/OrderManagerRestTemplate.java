package com.dc.managementservice;


import org.springframework.web.client.RestTemplate;


public class OrderManagerRestTemplate {
    //get orders list
    //get available worker list
    //assign workers to orders

    
    RestTemplate restTemplate =new RestTemplate();

    AvailableWorkerListMS activeWorkerList = new AvailableWorkerListMS();
     


    
    public void getAllOrders(){

        
        MOrderList managementOrderList = restTemplate.getForObject("http://localhost:8080/internal/orders", MOrderList.class);
        System.out.println(managementOrderList);
        System.out.println(MOrderList.orderUUIDList);
        
    }



    public void getAllWorkers(){

        AvailableWorkerListMS activeWorkerList = restTemplate.getForObject("http://localhost:8080/internal/workers", AvailableWorkerListMS.class);
        System.out.println(activeWorkerList);
        
        
    }




 


}

