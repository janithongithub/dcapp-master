package com.dc.simservice.floormap;

import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;

public class ShortestPathSimService {



    DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
            new DijkstraShortestPath<String, DefaultEdge>(FloorMapSimService.createStringGraph());



    public GraphPath<String, DefaultEdge> findShortestPath(String start, String stop){

        ShortestPathAlgorithm.SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths(start);
        return iPaths.getPath(stop);

        //iPaths.getGraph()  --- can get full map
    }


}