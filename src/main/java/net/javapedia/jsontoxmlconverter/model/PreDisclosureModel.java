package net.javapedia.jsontoxmlconverter.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class PreDisclosureModel implements Serializable {
    private String serviceCallerID;
    private PaymentInfo paymentInfo;
    private RecipientInfo recipientInfo;
    private BenificiaryBank benificiaryBank;
 }
