package com.uba.dashboard.ticketing.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "ISSUE_MASTER", schema = "ITHELPDESK")
@Data // Lombok annotation to automatically generate getters, setters, toString, etc.
public class IssueMaster {

    @Id
    @Column(name = "ISSUE_ID")
    private String issueId;

    @Column(name = "DATE_OPENED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOpened;

    @Column(name = "OWNER")
    private String owner;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CATEGORY")
    private Integer category;

    @Column(name = "CLOSED")
    private Integer closed;

    @Column(name = "CLOSED_BY")
    private String closedBy;

    @Column(name = "DATE_CLOSED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateClosed;

    @Column(name = "RESPONSIBLE")
    private String responsible;

    @Column(name = "BRANCH")
    private String branch;

    @Column(name = "LOGGED_BY")
    private String loggedBy;

    @Column(name = "CLOSURE_COMMENT")
    private String closureComment;

    @Column(name = "RESOLUTION_STATUS")
    private Integer resolutionStatus;

    @Column(name = "SEVERITY")
    private Integer severity;

    @Column(name = "BOUNCES")
    private Integer bounces;

    // Add other fields from your table as needed...
    // For simplicity, we are starting with the most relevant ones.
}