package com.bytecode.controller.requests;

import com.bytecode.domain.creditscore.CreditProfile;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Data
public class CustomerRequest {
    @NotBlank
    private String name;
    @NotNull
    private CreditProfile creditProfile;
    @NotBlank
    private String type;
    @NotNull
    private Document document;

    @Data
    public static class Document {
        private String code;
        private String type;
    }
}
