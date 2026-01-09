package com.example.bank.infrastructure.persistence;

import com.example.bank.domain.transfer.Transfer;
import com.example.bank.domain.transfer.TransferId;
import com.example.bank.domain.transfer.TransferRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Implementación in-memory.
 * Simula un ledger append-only.
 */
public class InMemoryTransferRepository implements TransferRepository {

    private final Map<String, Transfer> store = new LinkedHashMap<>();

    @Override
    public void save(Transfer transfer) {
        store.put(transfer.id().value(), transfer);
    }

    @Override
    public Optional<Transfer> findById(TransferId id) {
        return Optional.ofNullable(store.get(id.value()));
    }
}
