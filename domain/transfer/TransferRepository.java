package com.example.bank.domain.transfer;

import java.util.Optional;

/**
 * Puerto de persistencia.
 * El dominio no sabe cómo ni dónde se guarda.
 */
public interface TransferRepository {

    void save(Transfer transfer);

    Optional<Transfer> findById(TransferId id);
}
