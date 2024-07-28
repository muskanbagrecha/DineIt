package com.mb.dineit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.mail.Address;
import javax.mail.Message;

@Getter
@Setter
@AllArgsConstructor
public class EmailRecipient {
    private String address;
    private Message.RecipientType recipientType;

    public EmailRecipient(String address){
        this.address = address;
        recipientType = Message.RecipientType.TO;
    }

}
