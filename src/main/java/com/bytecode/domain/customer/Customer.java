package com.bytecode.domain.customer;

import com.bytecode.domain.creditscore.CreditProfile;
import lombok.Data;

@Data
public class Customer {
    private String nome;
    private String legalDocument;
    private String documentType;
    private CreditProfile creditProfile;
    private String endereco;
}
