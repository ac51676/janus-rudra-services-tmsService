package com.ctl.rudra.service.tmService.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmsTicket")
public class TicketingService {
	
	@RequestMapping(value = "/ticketSummary", method = RequestMethod.GET, produces = "application/json")
	public List<String> getTicketSummary() {
		
		List<String> list = Arrays.asList(new String[]{"Ticket One", "Ticket two"});
		return list;
	
	}

}
