package com.dc.simservice.RuntimeObjects;

import java.util.ArrayList;
import java.util.List;

public class AvailableWorkerListCom {


    public static List<Integer> AWListCom = new ArrayList<>();


    public void setAWListCom(List<Integer> list){
        AWListCom = list;
    }

    public List<Integer> getAWListCom(){
        return AWListCom;
    }
    
}