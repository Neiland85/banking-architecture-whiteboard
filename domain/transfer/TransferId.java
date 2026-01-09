package com.example.bank.domain.transfer;

import java.util.Objects;
import java.util.UUID;

/**
 * Value Object para identificar una transferencia.
 */
public final class TransferId {

    private final String value;

    private TransferId(String value) {
        this.value = value;
    }

    public static TransferId newId() {
        return new TransferId(UUID.randomUUID().toString());
    }

    public static TransferId from(String value) {
        Objects.requireNonNull(value, "transferId cannot be null");
        return new TransferId(value);
    }

    public String value() {
        return value;
    }
}
