package com.bytecode.domain.customer;

import com.bytecode.domain.creditscore.CreditProfile;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Embedded
    private Document legalDocument;
    private String documentType;

    private CreditProfile creditProfile;
    private String endereco;

    @Data
    @Embeddable
    public static class Document {
        private String code;
        private String type;
    }
}
