package com.famotech.spring_boot_kotlin_demo.dto

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("MESSAGE")
data class Message(@Id var id: String?, val text: String)
