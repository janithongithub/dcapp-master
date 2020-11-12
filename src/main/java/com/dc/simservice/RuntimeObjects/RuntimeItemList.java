package com.dc.simservice.RuntimeObjects;

import java.util.ArrayList;
import java.util.List;

public class RuntimeItemList {


    public static List<RuntimeItem> iList = new ArrayList<>();
    


    public RuntimeItemList() {
    }




    public List<RuntimeItem> getIList(){
        return iList;
    }
    public void setIList(List<RuntimeItem> list){
        iList = list;
    }



}