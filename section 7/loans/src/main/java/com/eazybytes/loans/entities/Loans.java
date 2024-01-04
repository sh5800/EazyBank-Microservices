package com.eazybytes.loans.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Loans extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    @Column(name = "loan_id")
    private Long loanId;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="loan_number")
    private String loanNumber;

    @Column(name="loan_type")
    private String loanType;

    @Column(name="total_loan")
    private Long totalLoan;

    @Column(name="amount_paid")
    private Long amountPaid;

    @Column(name="outstanding_amount")
    private Long outstandingAmount;

}
