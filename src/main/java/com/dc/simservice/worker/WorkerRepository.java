package com.dc.simservice.worker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface WorkerRepository extends CrudRepository<Worker,Integer> {
    

    
}