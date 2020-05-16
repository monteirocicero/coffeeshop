package com.orecic.kotlin.resourceserver

import com.orecic.kotlin.resourceserver.domain.entity.CoffeeShopEntity
import com.orecic.kotlin.resourceserver.infraestructure.CoffeeShopRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ResourceServerApplication {

	@Bean
	fun run(repository: CoffeeShopRepository) = ApplicationRunner {
		repository.save(CoffeeShopEntity(name = "Coffee Fradique", address = "Rua Fradique Coutinho, 1000 - Vila Madalena", phone = "1156874778", priceOfCoffe = 10.50, powerAccessible = true, internetReliability = 10))
		repository.save(CoffeeShopEntity(name = "Coffee Black", address = "Av Paulista, 1001 - Cerqueira Cezar", phone = "1122698536", priceOfCoffe = 8.35, powerAccessible = true, internetReliability = 8))
		repository.save(CoffeeShopEntity(name = "Mary Coffe", address = "Rua Consolação, 346 - Consolação", phone = "1185479628", priceOfCoffe = 6.10, powerAccessible = false, internetReliability = 7))
	}

}

fun main(args: Array<String>) {
	runApplication<ResourceServerApplication>(*args)
}
