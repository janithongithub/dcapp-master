package com.dc.simservice.worker;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dc.simservice.item.*;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "workertbl")
public class Worker {

    @Id
    int id;
    @Column(name = "wname")
    String name;
    @Column(name = "location")      //inital location need to be passed to worker service to generate path
    String location;
    @Column(name = "capacity")
    int capacity;

  //on_runtime
  /*
    List<String> actions = new ArrayList<>();        // probably a list
    String nextAction = null;
    int weight = 0;
    String notificationUri = null;     // check for java URI class
    Item holdingItem = null;

*/

    static List<Worker> workerList = new ArrayList<>();
    static List<Integer> workerIdList = new ArrayList<>();


    public Worker(){

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    

 

}

/*

{
	"name": "rem",
	"location": "a1.1",
	"capacity": 20,
	"actions": [],
	"nextAction": null,
	"weight": 0,
	“notificationUri":"...",
	"holding": []
}

The notificationUri should be set through a PATCH request to /workers/{name}
A copy of the action representation is POSTed to this Uri after the associated action is completed.
It is expected that this will trigger the submission of the next action to be carried out by the worker.

/workers:
GET: return a list of worker names
Body: n/a
Response: { “rem”, “bob”, … }

/workers/{name}
GET: return details of worker {name}
Body: n/a
Response: { “name” : ... }

PATCH: update the worker notificationUri
Body: { “notificationUri” : ...}
Response: 200 OK

/workers/{name}/nextAction
PUT: submit the workers next action
Body: { “type”: ... }
Response: 200 OK



-----------------------------------------------
Workers can perform 4 basic actions:
move(X): where X is an adjacent vertex id.
pick(S): where S is the name of a shelf at the current vertex.
drop(X): drops item with id X at the current location
pack(O): where O is number of the order to be packed (must be at a packaging station)
The order number is used to retrieve the order information from the Order Generator Service.
All items required for the order must have been “dropped” at the packaging station vertex.
Once packed, the items vanish from the vertex and a PATCH request is used to mark the order as completed.


*/