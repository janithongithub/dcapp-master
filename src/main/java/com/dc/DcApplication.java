package com.dc;

import com.dc.managementservice.AvailableWorkerListMS;
import com.dc.managementservice.MOrderList;
import com.dc.managementservice.OrderManager;
import com.dc.managementservice.OrderManagerRestTemplate;
import com.dc.ordergeneratorservice.Order;
import com.dc.ordergeneratorservice.OrderList;
import com.dc.simservice.RuntimeObjects.RuntimeObjects;
import com.dc.simservice.RuntimeObjects.AllWorkerList;
import com.dc.simservice.RuntimeObjects.RuntimeWorker;
import com.dc.simservice.worker.WorkerRepository;
import com.dc.workerservice.WBRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class DcApplication {



	public static void main(String[] args) {
		SpringApplication.run(DcApplication.class, args);


	/*	while(clock = true){ loop this actions passing URIs

		1 Generate order in intervals
		2 Manage Order
		3 Worker Service
		4 simulation Service

		// all sync with clock
		}
	*/

	RuntimeObjects runtimeObjects = new RuntimeObjects();
	runtimeObjects.create();



	////////////// testing order generation\\\\\\\\\\\

	for(int i=1; i<10;i++) {
		Order order = new Order();

		if(!(order.uuid == null)) {
			System.out.println(order.uuid);
			System.out.println(order.itemIdList);
			System.out.println(order.itemFrqencyList);
			System.out.println(order.getOrderStatus());
			System.out.println();
			//
		}

	}


	///////////////////testing orderlist in ordergenerator\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	//OrderList ol = new OrderList();
	System.out.println(MOrderList.orderUUIDList);
	System.out.println(" ");
	System.out.println(" ");
	///////////////////////testing object creation and REST List\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	System.out.println(RuntimeObjects.runtimeWorkerList);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(RuntimeObjects.runtimeItemList);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(AllWorkerList.AWList.get(0).getWorekrMapLocation());

	
	///////////////////testing management service \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	OrderManagerRestTemplate OrderManagerRestController = new OrderManagerRestTemplate();
	
	OrderManagerRestController.getAllOrders();
	//ManagementOrderList managementOrderList = new ManagementOrderList();
	System.out.println(MOrderList.orderUUIDList);

	OrderManagerRestController.getAllWorkers();

	System.out.println(AvailableWorkerListMS.AWListCom);
	

	OrderManager orderManager = new OrderManager();
	orderManager.assignOrders();
	WBRestTemplate wbRestTemplate = new WBRestTemplate();
	wbRestTemplate.getOrderWorkerMap();

	
	


	}

}
