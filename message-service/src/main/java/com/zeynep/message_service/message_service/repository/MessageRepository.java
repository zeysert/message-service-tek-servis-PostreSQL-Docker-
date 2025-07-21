package com.zeynep.message_service.message_service.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.zeynep.message_service.message_service.Model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
