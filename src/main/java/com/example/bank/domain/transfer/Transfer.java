package com.example.bank.domain.transfer;

import com.example.bank.domain.common.CorrelationId;

public class Transfer {

    private final TransferId id;
    private final CorrelationId correlationId;
    private TransferStatus status;

    public Transfer(TransferId id, CorrelationId correlationId) {
        this.id = id;
        this.correlationId = correlationId;
        this.status = TransferStatus.INITIATED;
    }

    public void markCompleted() {
        this.status = TransferStatus.COMPLETED;
    }
}
