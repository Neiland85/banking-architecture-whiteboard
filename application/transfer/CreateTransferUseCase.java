package com.example.bank.application.transfer;

import com.example.bank.domain.common.CorrelationId;
import com.example.bank.domain.transfer.*;

/**
 * Caso de uso: crear una transferencia.
 * Orquesta dominio + persistencia + evento.
 */
public class CreateTransferUseCase {

    private final TransferRepository repository;

    public CreateTransferUseCase(TransferRepository repository) {
        this.repository = repository;
    }

    public TransferCreatedEvent execute(CorrelationId correlationId) {

        TransferId transferId = TransferId.newId();
        Transfer transfer = new Transfer(transferId, correlationId);

        repository.save(transfer);

        return new TransferCreatedEvent(transferId, correlationId);
    }
}
