package com.microdust.socket.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class Microdust_WebSocket_Controller {

	@MessageMapping("/microdust/heartbeat")
	public void hearbeat() {
		System.out.println("Microdust HeartBeat");
	}
	
	@MessageMapping("/microdust/status/{manufacturer}/{modelCd}/{productId}")
	@SendTo("/sub/microdust/status/{manufacturer}/{modelCd}/{productId}")
	public HashMap<String, Object> microdustAircleanerStatus(@DestinationVariable String manufacturer,
														@DestinationVariable String modelCd,
														@DestinationVariable String productId,
														HashMap<String, Object> map) throws Exception {
		Thread.sleep(100);
		
		System.out.println("[AirClenaerStatus Map] : " + map);
		return map;
	}
	
	@MessageMapping("/microdust/collect/{manufacturer}/{modelCd}/{productId}")
	@SendTo("/sub/microdust/collect/{manufacturer}/{modelCd}/{productId}")
	public HashMap<String, Object> microdustAircleanerCollect(@DestinationVariable String manufacturer,
														@DestinationVariable String modelCd,
														@DestinationVariable String productId,
														HashMap<String, Object> map) throws Exception {
		Thread.sleep(100);
		
		System.out.println("[AirClenaerCollect Map] : " + map);
		return map;
	}
	
	@MessageMapping("/microdust/error/{manufacturer}/{modelCd}/{productId}")
	@SendTo("/sub/microdust/error/{manufacturer}/{modelCd}/{productId}")
	public HashMap<String, Object> microdustAircleanerError(@DestinationVariable String manufacturer,
														@DestinationVariable String modelCd,
														@DestinationVariable String productId,
														HashMap<String, Object> map) throws Exception {
		Thread.sleep(100);
		
		System.out.println("[AirClenaerError Map] : " + map);
		return map;
	}
}
