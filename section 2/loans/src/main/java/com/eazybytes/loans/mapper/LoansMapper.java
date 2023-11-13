package com.eazybytes.loans.mapper;

import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entities.Loans;

public class LoansMapper {

    public static LoansDto mapToLoansDto(Loans loans, LoansDto loansDto){
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setAmountPaid(loans.getAmountPaid());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        loansDto.setMobileNumber(loans.getMobileNumber());

        return loansDto;
    }

    public static Loans mapToLoans(LoansDto loansDto, Loans loans){
        loans.setLoanType(loansDto.getLoanType());
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setOutstandingAmount(loansDto.getOutstandingAmount());
        loans.setMobileNumber(loansDto.getMobileNumber());

        return loans;
    }
}
