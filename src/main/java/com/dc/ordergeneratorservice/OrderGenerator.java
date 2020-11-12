package com.dc.ordergeneratorservice;

import java.util.ArrayList;
import java.util.List;

public class OrderGenerator {
    //generate orders randomly according to probability

    List<Integer> itemIdList = new ArrayList<>();          // item ids are form 1 to 100 in DB
    List<Integer> itemFrequencyList = new ArrayList<>();
    int numberOfItems;
    int itemFrequency;



    public OrderGenerator(){
        
    }

    ///////////////////\\\\\\\\\\\\\\\\\\\\\\\\

    public int generateRandomInt0To100(){
        Double dn = Math.random()*100.0;
        return dn.intValue();
    }

    //////////////////\\\\\\\\\\\\\\\\\\\\\\\\\
    public int generateItemFrequency(){
        
            final int fPn = generateRandomInt0To100();

            if(fPn>0 && fPn<=33){
                //2 items
                int itemFrequency =2;
                return 2;

            }
            else if(fPn <= 36){
                //3 items
                int itemFrequency =3;
                return 3;
            }
            else{
                //1 item
                int itemFrequency =1;
                return 1;
            }

    }

    ////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public int generateItemId(){
        int tempItemId = generateRandomInt0To100();
        if(tempItemId==0){
            return 1;
        }else{

            return tempItemId;
        }

        
    }



    ///////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void generateRandomOrders(){



        //20% chance there will be an order
     final int first_20percent = generateRandomInt0To100();

     if(20 >= first_20percent && first_20percent > 0){



         final int pItems = generateRandomInt0To100();

         //Random number between 1 and 100 (inclusive)
         if (pItems <= 50 && pItems > 0)        // 50% chance
         {   //2 items
             numberOfItems =2;


             for(int i=1; i<=2; i++){
                itemIdList.add(generateItemId());

                itemFrequencyList.add(generateItemFrequency());

             }


         } 
         else if (pItems <= 75)        // 25% chance
         {  numberOfItems =3;
             //3 items

             for(int i=1; i<=3; i++){
                itemIdList.add(generateItemId());

                itemFrequencyList.add(generateItemFrequency());

             }


         } 
         else if (pItems <= 88)        // 13% chance
         {  numberOfItems = 4;
             //4 items

             for(int i=1; i<=4; i++){
                itemIdList.add(generateItemId());

                itemFrequencyList.add(generateItemFrequency());

             }



         } 
         else if (pItems <= 94)        // 6% chance
         {  numberOfItems = 5;
            //5 items


            for(int i=1; i<=5; i++){
                itemIdList.add(generateItemId());
                itemFrequencyList.add(generateItemFrequency());

             }



         } 
         else 
         {  numberOfItems=1;
             //1 item

             itemIdList.add(generateItemId());
             itemFrequencyList.add(generateItemFrequency());


         }

     }
     else {
         //No order generated 80% chance
     }


    }


}
