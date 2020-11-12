package com.dc.simservice.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemRestController {

    @Autowired
    ItemRepository itemRepository; // methods are inherited from extended CRUDRepository library

    public Iterable<Item> getAllItems() {
        Iterable<Item> itemList = new ArrayList<>();

        itemList = itemRepository.findAll();
        return itemList;

    }

    @RequestMapping("/{itemId}")
    public Optional<Item> getItemById(@PathVariable("workerId") int itemId) {
        return itemRepository.findById(itemId);

    }




    
}


/*abstract


/items
GET: return a list of items
Body: n/a
Response: { { “id” : ...}, ... }
/items/{id}
GET: return details of item {id}
Body: n/a
Response: { “id” : ...}



*/