package com.dc.managementservice;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableWorkerListMS {
    //template of RuntimeRESTWorkerList from sim service
    
    public static List<Integer> AWListCom = new ArrayList<>();


    public void setAWListCom(List<Integer> list){
        AWListCom = list;
    }

    public List<Integer> getAWListCom(){
        return AWListCom;
    }
 




}