package com.example.SMSenderApi.entities;

import com.example.SMSenderApi.enums.TypeRelance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Relances {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRelance;
    @Enumerated(EnumType.STRING)
    private TypeRelance typeRelance;
    private boolean isPeriodic;
    private boolean isAutomaticLoad;
    private Date dateRelance;
    private String message;
    private String objet;
    private boolean isActive;
    private Long createdBy;
    private Date CreatedDate;

    @OneToMany(mappedBy = "relances")
    private List<RelanceDetail> relanceDetails;

    @OneToMany(mappedBy = "relanceLogs")
    private List<Logs> logs;
}
