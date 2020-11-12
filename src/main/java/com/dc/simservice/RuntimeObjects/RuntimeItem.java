package com.dc.simservice.RuntimeObjects;

import java.util.Objects;

public class RuntimeItem {



    
    int itemId;             //id range 1 to 100    
    String name;   
    int weight;   
    String supplier;
    String location;
    String itemMapLocation; //real location to deal with the map to find shortest path
 
    public RuntimeItem(){
        
    }

    public RuntimeItem(int ID, String name, int weight, String supplier, String location){
    this.itemId = ID;
    this.name = name;
    this.weight = weight;
    this.supplier = supplier;
    this.location = location;

    //storing location as exact maplocation to deal with floormap
    Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
    this.itemMapLocation = value.toString();

    }




    public RuntimeItem(int itemId, String name, int weight, String supplier, String location, String itemMapLocation) {
        this.itemId = itemId;
        this.name = name;
        this.weight = weight;
        this.supplier = supplier;
        this.location = location;
        this.itemMapLocation = itemMapLocation;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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

    public void setItemMapLocation(){ //method for setting a1.2/A as 12

        Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
        itemMapLocation = value.toString();
    }

    ///////////////////////\\\\\\\\\\\\\\\\\\\\\

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RuntimeItem)) {
            return false;
        }
        RuntimeItem runtimeItem = (RuntimeItem) o;
        return itemId == runtimeItem.itemId && Objects.equals(name, runtimeItem.name) && weight == runtimeItem.weight && Objects.equals(supplier, runtimeItem.supplier) && Objects.equals(location, runtimeItem.location) && Objects.equals(itemMapLocation, runtimeItem.itemMapLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, name, weight, supplier, location, itemMapLocation);
    }

    @Override
    public String toString() {
        return "{" +
            " itemId='" + getItemId() + "'" +
            ", name='" + getName() + "'" +
            ", weight='" + getWeight() + "'" +
            ", supplier='" + getSupplier() + "'" +
            ", location='" + getLocation() + "'" +
            ", itemMapLocation='" + getItemMapLocation() + "'" +
            "}";
    }










}


