package com.dc.simservice.RuntimeObjects;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RuntimeObjectRESTController {


    
@GetMapping(value= "/internal/workers", produces  = MediaType.APPLICATION_JSON_VALUE)    
public AvailableWorkerListCom getAvailableWorkers(){

    AvailableWorkers availableWorkers = new AvailableWorkers();
    availableWorkers.getAvailableWorkers();     //searching and addiing available workerIDs

    return new AvailableWorkerListCom();
}



@GetMapping(value = "/internal/items", produces  = MediaType.APPLICATION_JSON_VALUE)
public RuntimeItemList getItemList(){
    return new RuntimeItemList();
}

@GetMapping(value = "/items", produces  = MediaType.APPLICATION_JSON_VALUE)
public RuntimeItemList getItemListExternal(){
    return new RuntimeItemList();
}



}

