package com.dc.simservice.RuntimeObjects;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RuntimeWorker {
    
   
    int id =0;
    
    String name = "Enter name";                     //inital location need to be passed to worker service to generate path
    String location = "Enter Location";
    String workerMapLocation = "Enter map Location"; //real location to deal with the map to find shortest path   
    int capacity = 0;


    //on_runtime 
    List<String> actions = new ArrayList<>();       // probably a list from floormap
    String nextAction = "Enter next action";
    int weight = 0;
    String notificationUri = "Enter notification URI";     // check for java URI class
    RuntimeItem holdingItem = null;


    ///////////////
    public static List<RuntimeWorker> workerList = new ArrayList<>();
    public static List<Integer> workerIdList = new ArrayList<>();

    

    public List<RuntimeWorker>  getWorkerList(){
        return workerList;
    }


    public void setWorkerList(List<RuntimeWorker> list){

        workerList = list;
    }

    public List<Integer> getWorkerIdList(){
        return workerIdList;
    }


    public void setWorkerIdList(List<Integer> list){

        workerIdList = list;
    }



    ///////////////


    public RuntimeWorker(){

    }

    public RuntimeWorker(int id, String name, String location, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.notificationUri = "http://localhost:8080/runtimeworker/" + this.name;
        


         //storing location as exact maplocation to deal with floormap
        Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
        this.workerMapLocation = value.toString();

        workerList.add(this);
        workerIdList.add(this.id);
    }

    ///////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public String getWorekrMapLocation(){
        //storing location as exact maplocation to deal with floormap
        Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
        return workerMapLocation = value.toString();
    }

    public void setWorkerMapLocation(String mapLocation){
        this.workerMapLocation = mapLocation;
    }
    ///////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
        Integer value = Integer.parseInt(location.replaceAll("[^0-9]", ""));
        this.workerMapLocation = value.toString();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getActions() {
        return this.actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getNextAction() {
        return this.nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNotificationUri() {
        return this.notificationUri;
    }

    public void setNotificationUri(String notificationUri) {
        this.notificationUri = notificationUri;
    }

    public RuntimeItem getHoldingItem() {
        return this.holdingItem;
    }

    public void setHoldingItem(RuntimeItem holdingItem) {
        this.holdingItem = holdingItem;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RuntimeWorker)) {
            return false;
        }
        RuntimeWorker runtimeWorker = (RuntimeWorker) o;
        return id == runtimeWorker.id && Objects.equals(name, runtimeWorker.name) && Objects.equals(location, runtimeWorker.location) && capacity == runtimeWorker.capacity && Objects.equals(actions, runtimeWorker.actions) && Objects.equals(nextAction, runtimeWorker.nextAction) && weight == runtimeWorker.weight && Objects.equals(notificationUri, runtimeWorker.notificationUri) && Objects.equals(holdingItem, runtimeWorker.holdingItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, capacity, actions, nextAction, weight, notificationUri, holdingItem);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", location='" + getLocation() + "'" +
            ", capacity='" + getCapacity() + "'" +
            ", actions='" + getActions() + "'" +
            ", nextAction='" + getNextAction() + "'" +
            ", weight='" + getWeight() + "'" +
            ", notificationUri='" + getNotificationUri() + "'" +
            ", holdingItem='" + getHoldingItem() + "'" +
            "}";
    }










}


