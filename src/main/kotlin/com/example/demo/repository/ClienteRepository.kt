package com.example.demo.repository

import com.example.demo.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository: JpaRepository<Usuario, Long> {
    fun findByEmail(email: String): Usuario?
}