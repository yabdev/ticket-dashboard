package com.uba.dashboard.ticketing.dto;

import java.util.Date;

// A record is a modern Java feature (since Java 16) that automatically
// creates a final class with private final fields, a constructor,
// getters, equals(), hashCode(), and toString() methods. Perfect for DTOs.
public record TicketSummaryDto(
    String issueId,
    String title,
    String owner,
    Date dateOpened,
    String responsible
) {}