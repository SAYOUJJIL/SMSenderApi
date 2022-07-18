package com.example.SMSenderApi.entities;

import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

public class Contacts {
    private Long idContact;
    private String identifiant;
    private Date dateExpiration;
    private String numTel;
    private String email;

    @OneToMany(mappedBy = "contact")
    private List<Logs> logs;
};
