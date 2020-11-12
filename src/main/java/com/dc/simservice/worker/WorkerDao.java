package com.dc.simservice.worker;

import java.util.List;

public interface WorkerDao {

    public List<Worker> viewAllwWorkers();

    public Worker getWorkerByName(String name);

    //public int patchNotificationUri();

    //public void submitNextAction();
    
}