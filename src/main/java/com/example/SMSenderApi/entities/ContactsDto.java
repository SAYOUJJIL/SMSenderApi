package com.example.SMSenderApi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
public class ContactsDto implements Serializable {
    private Long idContact;
    private String identifiant;
    private Date dateExpiration;
    private String numTel;
    private String email;
}
