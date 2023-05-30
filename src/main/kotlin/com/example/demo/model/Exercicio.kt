package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.NotBlank


@Entity
class Exercicio (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    val id: Long,

    @NotBlank
    var nome: String,

    @NotBlank
    var musculo: String,

    @NotBlank
    var imagem: String,
)
