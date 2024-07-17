package com.famotech.spring_boot_kotlin_demo.repository

import com.famotech.spring_boot_kotlin_demo.dto.Message
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, String> {
}