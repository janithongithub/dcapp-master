package com.dc.simservice.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "itemtbl")
public class Item {

    @Id
    int itemId;             //id range 1 to 100
    @Column(name = "name")
    String name;
    @Column(name = "weight")
    int weight;
    @Column(name = "supplier")
    String supplier;
    @Column(name = "location")
    String location;
    String itemMapLocation; //real location to deal with the map to find shortest path


    public Item(){
        //empty constructor
    }

    public Item(int ID, String name, int weight, String supplier, String location){
    this.itemId = ID;
    this.name = name;
    this.weight = weight;
    this.supplier = supplier;
    this.location = location;

    //storing location as exact maplocation to deal with floormap
    Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
    this.itemMapLocation = value.toString();

    }


////////////////////////////////////////////////////////////////////////////

    public void setItemMapLocation(){ //method for setting a1.2/A as 12

        Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
        itemMapLocation = value.toString();
    }
////////////////////////////////////////////////////////////////////////////



    ////getters and setters all

    public int getID() {
        return this.itemId;
    }

    public void setID(int ID) {
        this.itemId= ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
        Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
        this.itemMapLocation = value.toString();
    }

    public String getItemMapLocation() {
        return this.itemMapLocation;
    }


    
}


/*
{
	"id": "kitkat",
	"name": "Kit Kat",
	"weight": 1,
	"supplier": "Nestle",
	"location": "a1.2/A"
}

/items
GET: return a list of items
Body: n/a
Response: { { “id” : ...}, ... }

/items/{id}
GET: return details of item {id}
Body: n/a
Response: { “id” : ...}


*/
