package com.spring.spring.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import java.util.concurrent.ConcurrentHashMap

/**
@SpringBootApplication
class Application {
    companion object {
        val initialCustomers = arrayOf(Customer(1, "Kotlin"),
                Customer(2, "Spring"),
                Customer(3, "Microservice"))
    }

    @Bean
    fun customers() = ConcurrentHashMap<Int, Customer>(initialCustomers.associateBy(Customer::id))
}

@Controller
class FirstController {

    /**
    This is called dependency injection and is part of Spring Inversion of Control (IoC)

    @Autowired
    lateinit var service: ServiceInterface  // IoC

    @RequestMapping(value = ["/user/{name}"], method = [RequestMethod.GET])
    @ResponseBody
    fun hello(@PathVariable name: String) = service.getHello(name)
     */
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

**/