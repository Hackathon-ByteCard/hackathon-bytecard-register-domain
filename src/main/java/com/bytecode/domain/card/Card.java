package com.bytecode.domain.card;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Card {
    private String binReference;
    private String ownerCpfCnpj;
    private BigDecimal limit;
    private Boolean active;
    private Date firstUsageDate;
}
