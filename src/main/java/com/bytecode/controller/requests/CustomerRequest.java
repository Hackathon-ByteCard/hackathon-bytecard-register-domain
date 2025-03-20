package com.bytecode.controller.requests;

import com.bytecode.domain.creditscore.CreditProfile;
import lombok.Data;
@Data
public class CustomerRequest {
    private String name;
    private CreditProfile creditProfile;
    private String type;
    private Document document;

    @Data
    public static class Document {
        private String code;
        private String type;
    }
}
