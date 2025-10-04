package com.uba.dashboard.ticketing.service;

import com.uba.dashboard.ticketing.dto.TicketSummaryDto;
import com.uba.dashboard.ticketing.model.IssueMaster;
import com.uba.dashboard.ticketing.repository.IssueMasterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // Marks this class as a Spring service component
public class TicketService {

    private final IssueMasterRepository issueMasterRepository;

    // We use constructor injection. This is the recommended way to inject dependencies in Spring.
    // It makes the class easier to test and ensures dependencies are available when the class is created.
    public TicketService(IssueMasterRepository issueMasterRepository) {
        this.issueMasterRepository = issueMasterRepository;
    }

    public List<TicketSummaryDto> getOpenTickets() {
        // 1. Fetch all tickets from the database using the repository.
        List<IssueMaster> tickets = issueMasterRepository.findAll();

        // 2. Convert (map) the list of IssueMaster entities to a list of TicketSummaryDto objects.
        return tickets.stream()
                     .map(this::convertToDto)
                     .collect(Collectors.toList());
    }

    // A private helper method to handle the conversion from Entity to DTO.
    private TicketSummaryDto convertToDto(IssueMaster issue) {
        return new TicketSummaryDto(
            issue.getIssueId(),
            issue.getTitle(),
            issue.getOwner(),
            issue.getDateOpened(),
            issue.getResponsible()
        );
    }
}