package com.example.demo.controller

import com.example.demo.model.Treino
import com.example.demo.repository.TreinoRepository
import jakarta.persistence.EntityNotFoundException
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class Treino (private val treinoRepository: TreinoRepository){
    @Autowired
    lateinit var repository: TreinoRepository

    @GetMapping("/treino")
    fun getAllTreino(): MutableList<Treino> {
        return treinoRepository.findAll()
    }
    @PostMapping
    fun create(@Valid @RequestBody treino: Treino ): Treino {
        return  treinoRepository.save(treino)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") treinoId: Long, @Valid @RequestBody newTreino: Treino): Treino {
        val treino= treinoRepository.findById(treinoId).orElseThrow { EntityNotFoundException() }
        return treinoRepository.save(treino)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") treinoId: Long,){
        val treino =repository.findById(treinoId).orElseThrow { EntityNotFoundException() }
        repository.delete(treino)
    }
}