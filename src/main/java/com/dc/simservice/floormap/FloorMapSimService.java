package com.dc.simservice.floormap;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.springframework.stereotype.Component;

@Component
public class FloorMapSimService {

    static int rows,cols;

    static int verticesCount = rows*cols;

    
    static Integer vertexNum = 0;
    static List<String> li = new ArrayList<>();


    //default map counstructor
    public FloorMapSimService() {
        FloorMapSimService.rows = 10;
        FloorMapSimService.cols = 5;
    }

    //Configure map
    public FloorMapSimService(int rows, int cols) {
        FloorMapSimService.rows = rows;
        FloorMapSimService.cols = cols;
    }


    public static Graph<String, DefaultEdge> createStringGraph() {


        //creating vertex names
        for (int j = 1; j <= rows; j++) { // row number loop
            vertexNum = vertexNum + 10;
            li.add(vertexNum.toString());


            for (int i = 0; i < cols-1; i++) { // cols number loop
                vertexNum = vertexNum + 1;
                li.add(vertexNum.toString());

            }
            vertexNum = vertexNum - (cols - 1);


        }




        Graph<String, DefaultEdge> mapGraph = new SimpleGraph<>(DefaultEdge.class);

        // Adding vertices to graph
        for (int i = 0; i < li.size(); i++) {
            mapGraph.addVertex(li.get(i));
        }





        //Adding Edges to graph
        int counter = 0;

        for (int j = 0; j < rows; j++) {

            for (int i = 0; i < (cols - 1); i++) {
                mapGraph.addEdge(li.get(counter), li.get(counter + 1));
                counter++;
            }
            counter++;

        }

        int counterByCol = 0;
        //adding 1.0 2.0 ... edges to graph
        for(int k=0; k<(rows-1); k++){
            mapGraph.addEdge(li.get(counterByCol), li.get(counterByCol + cols));
            counterByCol = counterByCol + cols;
        }

        counterByCol = cols-1;
        //adding 1.X 2.X ..... edges to graph
        for(int l=0; l<(rows-1); l++){
            mapGraph.addEdge(li.get(counterByCol), li.get(counterByCol + cols));
            counterByCol = counterByCol + cols;
        }

        return mapGraph;
    }




    
}

