package com.famotech.spring_boot_kotlin_demo.service

import com.famotech.spring_boot_kotlin_demo.dto.Message
import org.springframework.stereotype.Service

@Service
interface MessageService {
    fun findMessages(): List<Message>
    fun save(message: Message): Message
    fun getMessageById(id: String): Message?
}