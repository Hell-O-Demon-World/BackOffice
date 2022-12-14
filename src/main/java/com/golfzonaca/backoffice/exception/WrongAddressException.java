package com.golfzonaca.backoffice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.NoSuchElementException;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "error.address")
public class WrongAddressException extends NoSuchElementException {
    public WrongAddressException(String s) {
        super(s);
    }
}
