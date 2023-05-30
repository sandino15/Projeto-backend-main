package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank


@Entity
class Treino (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    val id: Long,

    @NotBlank
    var dia: String,

    @NotBlank
    var musculo: String,

    @NotBlank
    var nome:String,


)