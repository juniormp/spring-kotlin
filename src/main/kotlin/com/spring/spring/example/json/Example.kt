package com.spring.spring.example.json

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class SimpleObject(var name: String = "hello", var place: String = "world")

@RestController
class JsonExamplesController {
    @GetMapping(value = ["/json"])
    fun getJson() = SimpleObject("hi", "kotlin")
}



data class ComplexObject(var object1 : SimpleObject? = null)

@RestController
class JsonComplexExamplesController {
    @GetMapping(value = ["/json"])
    fun getJson() = ComplexObject(object1 = SimpleObject("more", "complex"))
}