package com.dc.simservice.worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workers")
public class WorkerRestController {

    @Autowired
    WorkerRepository workerRepository; //methods are inherited from extended CRUDRepository library




    @GetMapping
    public List<String> getAllWorkersNames() {

        Iterable<Worker> workerList = new ArrayList<>();
        List<String> namesList = new ArrayList<>();

        workerList = workerRepository.findAll(); 

        for (Worker worker : workerList) {
            namesList.add(worker.name);
            
        }

        return namesList;    

    }


    @GetMapping("/{workerId}")
    public Optional<Worker> getWorkerByIdFromDB(@PathVariable("workerId")int workerId) {
         return workerRepository.findById(workerId);

    }

 
/*
    @GetMapping("/{name}")
    @ResponseBody
    public Worker getWorkerByName(@PathVariable("name")String name) {
        Iterable<Worker> workerList =new ArrayList<>();

         workerList = workerRepository.findAll();



        for ( Worker worker : workerList) {

            if(name == worker.name){
                return worker;
                
            }

            
        }

        return null;
        
       
    }
    */
    
}


/*abstract

/workers:
GET: return a list of worker names
Body: n/a
Response: { “rem”, “bob”, … }

/workers/{name}
GET: return details of worker {name}
Body: n/a
Response: { “name” : ... }

*/