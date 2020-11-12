package com.dc.simservice.RuntimeObjects;

import java.util.ArrayList;
import java.util.List;



public class AllWorkerList {
    

    public static List<RuntimeWorker> AWList = new ArrayList<>();


    
    public List<RuntimeWorker> getWList(){
        return AllWorkerList.AWList;
    }


    public void setWList(List<RuntimeWorker> list){
        AWList = list;
    }

}