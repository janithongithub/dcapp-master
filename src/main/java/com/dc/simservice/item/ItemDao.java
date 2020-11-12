package com.dc.simservice.item;

import java.util.List;

public interface ItemDao {
    
    public List<Item> viewAllItems();

    public Item getItemByID(int item);
}