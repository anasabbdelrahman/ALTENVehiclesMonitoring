package com.alten.vmc.error;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


public class errorHandler {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void validationErrorProcess(IllegalArgumentException argumentException) {
        log.info("HTTP 400 Bad Request!", argumentException);
    }}
