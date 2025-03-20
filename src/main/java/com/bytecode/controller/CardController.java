package com.bytecode.controller;

import com.bytecode.controller.requests.CardRequest;
import com.bytecode.domain.shared.errors.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.UUID;

public class CardController {
    @PostMapping
    public ResponseEntity<?> createCard(@PathVariable UUID customerId, @RequestBody CardRequest request) {
        if (request.getMinAcceptedLimit() != null && request.getMinAcceptedLimit() > request.getRequestedLimit()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ErrorResponse("invalid-request", "Limite mínimo maior que o limite solicitado", "Por favor, entre em contato com o suporte")
            );
        }
        if (true) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                    new ErrorResponse("acquirement-rejected", "Perfil de crédito", "Por favor tente novamente em alguns meses")
            );
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("pan", UUID.randomUUID(), "limit", request.getRequestedLimit()));
    }
}
