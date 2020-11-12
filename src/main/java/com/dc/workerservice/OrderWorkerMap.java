package com.dc.workerservice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OrderWorkerMap {
    


    static Map<UUID,Integer> orderWorkerMap = new HashMap<>();

    public Map<UUID,Integer> getOrderWorkerMapCom(){
        return orderWorkerMap;
    }

    public void setOrderWorkerMapCom(Map<UUID,Integer> hMap){
        orderWorkerMap = hMap;
    }



}