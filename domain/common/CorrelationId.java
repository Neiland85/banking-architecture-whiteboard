package com.example.bank.domain.common;

import java.util.Objects;
import java.util.UUID;

/**
 * Identificador de correlación para trazabilidad end-to-end.
 * Se propaga entre capas y servicios.
 */
public final class CorrelationId {

    private final String value;

    private CorrelationId(String value) {
        this.value = value;
    }

    public static CorrelationId newId() {
        return new CorrelationId(UUID.randomUUID().toString());
    }

    public static CorrelationId from(String value) {
        Objects.requireNonNull(value, "correlationId cannot be null");
        return new CorrelationId(value);
    }

    public String value() {
        return value;
    }
}
