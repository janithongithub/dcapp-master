package com.dc.managementservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemManagement {


        
    int itemId;             //id range 1 to 100    
    String name;   
    int weight;   
    String supplier;
    String location;
    String itemMapLocation; //real location to deal with the map to find shortest path
}
