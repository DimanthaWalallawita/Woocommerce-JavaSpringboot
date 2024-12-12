package com.dailycodework.dreamshop.exceptions;

import org.jetbrains.annotations.NotNull;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
