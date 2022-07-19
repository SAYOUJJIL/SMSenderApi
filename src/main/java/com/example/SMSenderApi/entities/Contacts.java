package com.example.SMSenderApi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContact;
    private String identifiant;
    private Date dateExpiration;
    private String numTel;
    private String email;

    @OneToMany(mappedBy = "contacts")
    private List<Logs> logs;
};
