package fi.jyu.pservice;

import javax.xml.ws.Endpoint;

import fi.jyu.pservice.ComputeAreaImpl;

public class Exporter {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/jyuService/pservice", new ComputeAreaImpl());
		System.out.println("Exporting Success");
	}
}
