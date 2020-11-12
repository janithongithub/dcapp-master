package com.dc.managementservice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OrderMSHashMapCom {
    


    static Map<UUID,Integer> orderWorkerMapCom = new HashMap<>();

    public Map<UUID,Integer> getOrderWorkerMapCom(){
        return orderWorkerMapCom;
    }

    public void setOrderWorkerMapCom(Map<UUID,Integer> hMap){
        orderWorkerMapCom = hMap;
    }
}