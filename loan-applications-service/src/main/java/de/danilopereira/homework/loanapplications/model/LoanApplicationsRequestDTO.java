package de.danilopereira.homework.loanapplications.model;

import lombok.Data;

@Data
public class LoanApplicationsRequestDTO {
    private String id;
    private String customerId;
    private Double amount;
    private int duration;

}
