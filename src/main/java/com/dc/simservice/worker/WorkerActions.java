package com.dc.simservice.worker;

import com.dc.simservice.item.Item;

public class WorkerActions {        //runtime 

    Worker worker;
    Item item;

    public void move(/*vertexId*/){

    }

    public void pick(/*shelf at current vertex*/){

    }

    public void drop(/* item ,location*/){

    }

    public void pack(/* OrderID */){

    }
}



/*abstract

Workers can perform 4 basic actions:
move(X): where X is an adjacent vertex id.
pick(S): where S is the name of a shelf at the current vertex.
drop(X): drops item with id X at the current location
pack(O): where O is number of the order to be packed (must be at a packaging station)
The order number is used to retrieve the order information from the Order Generator Service.
All items required for the order must have been “dropped” at the packaging station vertex.

Once packed, the items vanish from the vertex and a PATCH request is used to mark the order as completed.




*/