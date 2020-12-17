package com.example.bankaccount

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("account")
class AccountController(val repository: AccountRepository) {

    @PostMapping
    fun create(@RequestBody account: Account): ResponseEntity<Account> = ResponseEntity.ok(repository.save(account))

    //    fun create(@RequestBody account: Account): ResponseEntity<Account> {
    //        val accountSave = repository.save(account)
    //        return ResponseEntity.ok(accountSave)
    //    }

    @GetMapping
    fun read() = ResponseEntity.ok(repository.findAll())
    // fun read():ResponseEntity<(Mutable)List<Account>> = ResponseEntity.ok(repository.findAll())
}