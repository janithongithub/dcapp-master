package com.dc.simservice.floormap;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/map")
public class MapRESTController {

FloorMapSimService floorMapSimService = new FloorMapSimService();  

ShortestPathSimService shortestPathSimService = new ShortestPathSimService();


    // returns map with edges and vertices
    @GetMapping(produces  = MediaType.APPLICATION_JSON_VALUE)
    public String getMap(){
         
        System.out.println(FloorMapSimService.createStringGraph());
        

       return FloorMapSimService.createStringGraph().toString();
    }



    @RequestMapping(path = "/{start}/{stop}", method = RequestMethod.GET)
    public String getShortestPath(@PathVariable String start,@PathVariable  String stop){

        System.out.println(shortestPathSimService.findShortestPath(start, stop).toString());
         return shortestPathSimService.findShortestPath(start, stop).toString();
         


    }
    


    


}