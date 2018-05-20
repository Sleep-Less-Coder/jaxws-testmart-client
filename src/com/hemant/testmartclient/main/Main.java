package com.hemant.testmartclient.main;

import java.util.List;

import com.hemant.testmartclient.generated.TestMartCatalog;
import com.hemant.testmartclient.generated.TestMartCatalogService;

public class Main {
	public static void main(String[] args) {
		
		// Create a news instance of the service
		
		TestMartCatalogService service = new TestMartCatalogService();
		
		// Get the port from the service
		
		TestMartCatalog port =  service.getTestMartCatalogPort();
		
		// Call methods/operations on the port
		
		List<String> result = port.getProducts("music");
		
		// Show the result to the console
		
		System.out.println("The response from the web service is: ");
		System.out.println("======================================");
		
		for(String string : result) {
			System.out.println(string);
		}
		
	}
}
