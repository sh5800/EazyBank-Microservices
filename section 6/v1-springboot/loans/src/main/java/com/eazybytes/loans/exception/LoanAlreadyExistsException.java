package com.eazybytes.loans.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LoanAlreadyExistsException extends RuntimeException {
    /**
     *
     * @param message
     */
    public LoanAlreadyExistsException(String message){
        super(message);
    }
}
