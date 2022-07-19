package com.example.SMSenderApi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class RelanceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRelanceDetail;
    @ManyToOne
    @JoinColumn(name="idRelance")
    private Relances relances;
    private String connexionString;
    private String script;
}
