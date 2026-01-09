package com.example.bank.domain.transfer;

import com.example.bank.domain.common.CorrelationId;

/**
 * Evento de dominio: hecho de negocio inmutable.
 */
public record TransferCreatedEvent(
        TransferId transferId,
        CorrelationId correlationId
) {
}
