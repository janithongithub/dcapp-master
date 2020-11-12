package com.dc.managementservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("internal/ordermap")
public class OrderManagerRestControllerInternal {
    
    @GetMapping(produces  = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody OrderMSHashMapCom getOrderMap() {
        return new OrderMSHashMapCom();
        //returning OrderMSHashMapCom class

    }



}