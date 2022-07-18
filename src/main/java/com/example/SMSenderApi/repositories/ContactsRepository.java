package com.example.SMSenderApi.repositories;

import com.example.SMSenderApi.entities.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts,Long> {
}
