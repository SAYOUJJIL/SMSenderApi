package com.example.SMSenderApi.repositories;

import com.example.SMSenderApi.entities.Logs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsRepository extends JpaRepository<Logs,Long> {
}
