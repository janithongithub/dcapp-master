package com.dc.managementservice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



public class OrderManager {
    // manage orders
    //assign to workers
    //check if a woker is available from worker service if yes assign order.
    // if no check next worker
    //if all workers are busy keep order in a queue until wokers are available

    //need Order Id from ordergeneratorservice 
    //send order id to available worker then worker service complete the order and store completed = true in database


    public void assignOrders(){

       // ActiveWorkerList  all available workers
       //MorderList     all orders
       // check unique order UUID and if UUID not present in map adds order and assign worker to it

        Map<UUID,Integer> orderWorkerMap = new HashMap<>();

        for(int i=0; i< MOrderList.orderUUIDList.size(); i++){
            if(!(orderWorkerMap.containsKey(MOrderList.orderUUIDList.get(i))))
            {
                if(!(AvailableWorkerListMS.AWListCom.isEmpty())){
                orderWorkerMap.put(MOrderList.orderUUIDList.get(i), AvailableWorkerListMS.AWListCom.get(i));
                }
            }

        }

        OrderMSHashMapCom.orderWorkerMapCom = orderWorkerMap;



    }



}
