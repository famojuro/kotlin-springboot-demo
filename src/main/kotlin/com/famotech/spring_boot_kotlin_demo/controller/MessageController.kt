package com.famotech.spring_boot_kotlin_demo.controller

import com.famotech.spring_boot_kotlin_demo.dto.Message
import com.famotech.spring_boot_kotlin_demo.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/messages")
class MessageController(val messageService: MessageService) {

    @GetMapping("")
    fun index(): List<Message> {
      return messageService.findMessages()
    }

    @PostMapping("")
    fun create(@RequestBody message: Message) {
        messageService.save(message)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: String): Message? {
        return messageService.getMessageById(id)
    }
}
