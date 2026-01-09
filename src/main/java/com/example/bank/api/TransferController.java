package com.example.bank.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfers")
public class TransferController {

    @PostMapping
    public ResponseEntity<Void> createTransfer(
            @RequestHeader("X-Correlation-Id") String correlationId) {

        // delega en el caso de uso
        return ResponseEntity.accepted().build();
    }
}
