package com.example.SMSenderApi.dtos;

import com.example.SMSenderApi.enums.Status;
import lombok.Data;
import java.util.Date;

@Data
public class LogsDto {
    private Long idLog;
    private Status status;
    private String message;
    private Long createdBy;
    private Date createdDate;
}
