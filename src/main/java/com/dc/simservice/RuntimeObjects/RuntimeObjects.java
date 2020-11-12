package com.dc.simservice.RuntimeObjects;

import java.util.ArrayList;
import java.util.List;

public class RuntimeObjects {

public static List<RuntimeWorker> runtimeWorkerList = new ArrayList<>();
public static List<RuntimeItem> runtimeItemList = new ArrayList<>();

RuntimeItemList runtimeRESTItemList = new RuntimeItemList();
AllWorkerList runtimeRESTWorkerList = new AllWorkerList();



    //Runtime worker Objects creation
    public RuntimeWorker rem;  
    public RuntimeWorker luke; 
    public RuntimeWorker don;   
    public RuntimeWorker janitha;
    public RuntimeWorker rug;
    public RuntimeWorker ron;
    public RuntimeWorker maggie;
    public RuntimeWorker john;
    public RuntimeWorker alice;
    public RuntimeWorker bob;   //10



    //Runtime items creation
    public RuntimeItem oreo;
    public RuntimeItem milkchocolate;
    public RuntimeItem dew;
    public RuntimeItem smak;
    public RuntimeItem milo;
    public RuntimeItem tipitip;
    public RuntimeItem cheeseballs;
    public RuntimeItem nutella;
    public RuntimeItem mnoodles;
    public RuntimeItem jello;    //10




    public RuntimeObjects() {
    }



    public void create() {

        //Workers
        rem = new RuntimeWorker(1, "rem", "a1.1", 20);
        runtimeWorkerList.add(rem);

        luke = new RuntimeWorker(2,"luke", "a2.3", 30);
        runtimeWorkerList.add(luke);

        don = new RuntimeWorker(3,"don", "a1.3", 25);
        runtimeWorkerList.add(don);

        janitha = new RuntimeWorker(4,"janitha", "a4.2", 18);
        runtimeWorkerList.add(janitha);

        rug = new RuntimeWorker(5,"rug", "a5.3", 35);
        runtimeWorkerList.add(rug);

        ron = new RuntimeWorker(6,"ron", "a1.1", 20);
        runtimeWorkerList.add(ron);

        maggie = new RuntimeWorker(7,"maggie", "a3.3", 30);
        runtimeWorkerList.add(maggie);

        john = new RuntimeWorker(8,"john", "a2.4", 25);
        runtimeWorkerList.add(john);

        alice = new RuntimeWorker(9,"alice", "a4.3", 18);
        runtimeWorkerList.add(alice);

        bob = new RuntimeWorker(10,"bob", "a5.1", 35);
        runtimeWorkerList.add(bob);

        AllWorkerList.AWList = runtimeWorkerList;




        //Items
        oreo = new RuntimeItem(1, "oreo",2 , "abc","a1.1/A");
        runtimeItemList.add(oreo);
        //RuntimeRESTItemList.iList.add(oreo);

        milkchocolate= new RuntimeItem(2, "milkchocolate", 3, "nmm","a2.3/B");
        runtimeItemList.add(milkchocolate);

        dew= new RuntimeItem(3, "dew", 4, "popp","a4.4/C");
        runtimeItemList.add(dew);

        smak= new RuntimeItem(4, "smak", 4, "sshd","a5.2/K");
        runtimeItemList.add(smak);
        
        milo= new RuntimeItem(5, "milo", 2, "erd","a3.2/E");
        runtimeItemList.add(milo);

        tipitip= new RuntimeItem(6, "tipitip", 1, "wed","a3.2/L");
        runtimeItemList.add(tipitip);

        cheeseballs= new RuntimeItem(7, "cheeseballs", 5, "wesx","a2.2/D");
        runtimeItemList.add(cheeseballs);

        nutella= new RuntimeItem(8, "nutella",7 , "jklo","a3.2/B");
        runtimeItemList.add(nutella);

        mnoodles= new RuntimeItem(9, "mnoodles", 2, "wwer","a6.3/L");
        runtimeItemList.add(mnoodles);

        jello= new RuntimeItem(10, "jello", 5, "khsa","a5.2/F");
        runtimeItemList.add(jello);


        //Adding items to REST list
        RuntimeItemList.iList = runtimeItemList;




    }







    //Runtime worker Items creation


    







}




/*abstract

'1','rem','a1.1','20'
'2','luke','a2.3','30'
'3','don','a1.3','25'
'4','janitha','a4.2','18'
'5','rug','a5.3','35'
'6','ron','a1.1','20'
'7','maggie','a3.3','30'
'8','john','a2.4','25'
'9','alice','a4.3','18'
'10','bob','a5.1','35'




*/