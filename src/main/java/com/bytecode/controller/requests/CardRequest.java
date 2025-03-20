package com.bytecode.controller.requests;

import lombok.Data;

@Data
public class CardRequest {
    private Double requestedLimit;
    private Double minAcceptedLimit;
}
