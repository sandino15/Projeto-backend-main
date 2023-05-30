package com.example.demo.controller

import com.example.demo.model.Login
import com.example.demo.model.Usuario
import com.example.demo.repository.ClienteRepository
import com.example.demo.response.Erro
import com.example.demo.response.Sucesso
import jakarta.persistence.EntityNotFoundException
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class Cliente (private val clienteRepository: ClienteRepository){
    @Autowired
    lateinit var repository: ClienteRepository

    @GetMapping("/articles")
    fun getAllArticles(): List<Usuario> {
        return repository.findAll()
    }
    @PostMapping
    fun create(@Valid @RequestBody usuario: Usuario): Usuario {
        return  repository.save(usuario)
    }

    @GetMapping("/usuario/{idUsuario}")
    fun getUsuarioById(@PathVariable(value = "iddousuario") idUsuario: Long):
            ResponseEntity<Usuario>? {
        return repository.findById(idUsuario).map { usuario ->
            ResponseEntity.ok(usuario)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PutMapping("/{id}")
    fun update(@PathVariable ("id") Id: Long, @Valid @RequestBody newUsuario: Usuario): Usuario {
    val article= repository.findById(Id).orElseThrow { EntityNotFoundException() }

        article.apply {
            this.nome = newUsuario.nome
            this.email = newUsuario.email
        }
     return repository.save(article)
    }

@DeleteMapping("/{id}")
fun delete(@PathVariable ("id") Id: Long,){
    val article =repository.findById(Id).orElseThrow { EntityNotFoundException() }
    repository.delete(article)
}


    @PostMapping("/login")
    fun login(@Valid @RequestBody login: Login): ResponseEntity<Any> {
        val usuario = login.email?.let {
            repository.findByEmail(it)
        } ?: run {
            login.id?.let {
                this.getUsuarioById(login.id)?.body
            }
        }
        usuario?.let { usuario ->
            if (login.senha == usuario.senha) {
                return createSucessoResponse(data = usuario)
            } else {
                return createErroResponse()
            }
        } ?: run {
            return createErroResponse()
        }

    }

    private fun createErroResponse(
    menssage: String = "Senha invalida!",
    code: HttpStatusCode = HttpStatus.UNAUTHORIZED
    ): ResponseEntity<Any>{
        return ResponseEntity.status(code)
            .body(
                Erro(
                    errorMessage = menssage,
                    errorCode = code.value()
                )
            )
    }
    private fun <T> createSucessoResponse(
        message: String = "Login realizado com sucesso!",
        data: T
    ): ResponseEntity<Any> {
        return ResponseEntity.ok(Sucesso(message = message, data = data))
    }
}