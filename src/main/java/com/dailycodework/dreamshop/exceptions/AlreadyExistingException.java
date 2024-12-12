package com.dailycodework.dreamshop.exceptions;

import org.jetbrains.annotations.NotNull;

public class AlreadyExistingException extends RuntimeException {
    public AlreadyExistingException(String message) {
        super(message);
    }
}
