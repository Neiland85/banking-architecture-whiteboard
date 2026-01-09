package com.example.bank.domain.transfer;

import com.example.bank.domain.common.CorrelationId;

import java.util.Objects;

/**
 * Aggregate Root de Transfer.
 * Contiene identidad, estado y reglas de transición.
 */
public class Transfer {

    private final TransferId id;
    private final CorrelationId correlationId;
    private TransferStatus status;

    public Transfer(TransferId id, CorrelationId correlationId) {
        this.id = Objects.requireNonNull(id);
        this.correlationId = Objects.requireNonNull(correlationId);
        this.status = TransferStatus.INITIATED;
    }

    public TransferId id() {
        return id;
    }

    public CorrelationId correlationId() {
        return correlationId;
    }

    public TransferStatus status() {
        return status;
    }

    public void markCompleted() {
        this.status = TransferStatus.COMPLETED;
    }

    public void markFailed() {
        this.status = TransferStatus.FAILED;
    }
}
