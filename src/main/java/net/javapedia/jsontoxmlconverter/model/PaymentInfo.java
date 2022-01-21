package net.javapedia.jsontoxmlconverter.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PaymentInfo {
    private String wireOriginationLOB;
    private String wireOriginationChannel;
    private String debitAccountType;
    private String debitAccountNumber;
    private String transferDate;
    private String transferAmount;
    private String receiverCreditCurrency;
    private String chargeOption;
}
