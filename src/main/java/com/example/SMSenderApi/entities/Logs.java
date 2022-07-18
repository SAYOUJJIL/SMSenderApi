package com.example.SMSenderApi.entities;

import com.example.SMSenderApi.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLog;

    @ManyToOne
    private Relances relanceLogs;

    @ManyToOne
    private Contacts contact;
    private Status status;
    private String message;
    private Long createdBy;
    private Date createdDate;
}
