package com.example.demo.controller

import com.example.demo.model.Exercicio
import com.example.demo.repository.ExercicioRepository
import jakarta.persistence.EntityNotFoundException
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class Exercicio (private val exercicioRepository: ExercicioRepository){
    @Autowired
    lateinit var repository: ExercicioRepository

    @GetMapping("/articles")
    fun getAllExercicio(): MutableList<Exercicio> {
        return exercicioRepository.findAll()
    }
    @PostMapping
    fun create(@Valid @RequestBody exercicio: Exercicio): Exercicio {
        return  exercicioRepository.save(exercicio)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") exercicioId: Long, @Valid @RequestBody newExercicio: Exercicio): Exercicio {
        val exercicio= exercicioRepository.findById(exercicioId).orElseThrow { EntityNotFoundException() }
        return exercicioRepository.save(exercicio)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") exercicioId: Long,){
        val article =repository.findById(exercicioId).orElseThrow { EntityNotFoundException() }
        repository.delete(article)
    }
}