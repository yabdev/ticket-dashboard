package com.uba.dashboard.ticketing.controller;

import com.uba.dashboard.ticketing.dto.TicketSummaryDto;
import com.uba.dashboard.ticketing.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This combines @Controller and @ResponseBody, telling Spring this controller's methods will return JSON.
@RequestMapping("/api/v1/tickets") // Sets the base URL for all endpoints in this controller.
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping // Maps HTTP GET requests to this method.
    public List<TicketSummaryDto> getAllOpenTickets() {
        // The controller's job is simple: call the service and return what it gets.
        // Spring Boot, with its Jackson library, will automatically serialize the List into a JSON array.
        return ticketService.getOpenTickets();
    }
}