package com.famotech.spring_boot_kotlin_demo.serviceImpl

import com.famotech.spring_boot_kotlin_demo.dto.Message
import com.famotech.spring_boot_kotlin_demo.repository.MessageRepository
import com.famotech.spring_boot_kotlin_demo.service.MessageService
import org.springframework.jdbc.core.simple.JdbcClient
import org.springframework.stereotype.Component
import java.util.*

@Component
class MessageServiceImpl(private val messageRepository:  MessageRepository) : MessageService {
//    override fun findMessages(): List<Message> = db.sql("SELECT * FROM messages")
//        .query{row, _ ->
//            Message(
//                id = row.getString("id"),
//                text = row.getString("text"),)
//        }.list()

    override fun findMessages(): List<Message> = messageRepository.findAll().toList()

//    override fun save(message: Message) {
//        val id = message.id ?: UUID.randomUUID().toString()
//
//       db.sql("INSERT INTO messages values(:id, :text)")
//            .param("id", id)
//            .param("text", message.text)
//            .update()
//    }

    override fun save(message: Message): Message = messageRepository.save(message)

//    override fun getMessageById(id: String): Message? {
//        return db.sql("SELECT * FROM messages WHERE id=:id")
//            .param("id", id)
//            .query {
//                    row, _ -> Message(
//                id = row.getString("id"),
//                text = row.getString("text")
//            )
//            }.single()
//    }

    override fun getMessageById(id: String): Message? = messageRepository.findById(id).orElse(null)

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()

}