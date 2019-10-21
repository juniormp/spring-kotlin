package com.spring.spring.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap

@RestController
class CustomerController {
    @Autowired
    lateinit var customers : ConcurrentHashMap<Int, Customer>


    @RequestMapping(value= ["/customer/{id}"], method= [RequestMethod.GET])
    fun getCustomerById(@PathVariable id : Int) = customers[id]

    @RequestMapping(value= ["/customers"], method= [RequestMethod.GET])
    fun getCustomers() = customers.map(Map.Entry<Int, Customer>::value).toList()

    @RequestMapping(value=["/customer/"], method=[RequestMethod.POST])
    fun createCustomer(@RequestBody customer: Customer){
        customers[customer.id] = customer
    }

    @RequestMapping(value = ["/customer/{id}"], method = [RequestMethod.DELETE])
    fun deleteCustomer(@PathVariable id: Int) = customers.remove(id)

    @RequestMapping(value = ["/customer/{id}"], method = [RequestMethod.PUT])
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: Customer) {
        customers.remove(id)
        customers[customer.id] = customer
    }
}

data class Customer(var id: Int = 0, var name: String = "")