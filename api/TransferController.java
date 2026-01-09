package com.example.bank.api;

import com.example.bank.application.transfer.CreateTransferUseCase;
import com.example.bank.domain.common.CorrelationId;
import com.example.bank.domain.transfer.TransferCreatedEvent;

/**
 * Capa API.
 * No contiene lógica de negocio.
 */
public class TransferController {

    private final CreateTransferUseCase useCase;

    public TransferController(CreateTransferUseCase useCase) {
        this.useCase = useCase;
    }

    /**
     * Simulación de endpoint HTTP POST /transfers
     */
    public TransferCreatedEvent createTransfer(String correlationIdHeader) {

        CorrelationId correlationId =
                correlationIdHeader == null
                        ? CorrelationId.newId()
                        : CorrelationId.from(correlationIdHeader);

        return useCase.execute(correlationId);
    }
}
