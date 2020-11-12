package com.dc.simservice.RuntimeObjects;

import java.util.ArrayList;
import java.util.List;

public class AvailableWorkers {


    RuntimeWorker runtimeWorker = new RuntimeWorker();
    public List<Integer> availableWorkersId = new ArrayList<>();

    public void getAvailableWorkers(){


    //getting all workers available and saving to a list
    for(RuntimeWorker worker: RuntimeWorker.workerList ){

        if(worker.holdingItem == null){
                availableWorkersId.add(worker.id);
        }
    }
    AvailableWorkerListCom.AWListCom = availableWorkersId;
}

    
}