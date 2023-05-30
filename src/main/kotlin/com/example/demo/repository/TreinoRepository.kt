package com.example.demo.repository

import com.example.demo.model.Treino
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TreinoRepository: JpaRepository<Treino, Long> {

}