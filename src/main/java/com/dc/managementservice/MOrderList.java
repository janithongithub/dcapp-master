package com.dc.managementservice;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MOrderList {

    

    public static List<UUID> orderUUIDList = new ArrayList<>();

    
    public MOrderList() {
    }



    public List<UUID> gerOrderUUIDList(){
        return orderUUIDList;
    }

    public void setOrderUUIDList(List<UUID> list){

        orderUUIDList = list;
    }

    
}

//Static List

