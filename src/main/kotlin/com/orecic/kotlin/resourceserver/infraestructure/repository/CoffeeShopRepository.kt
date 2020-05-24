package com.orecic.kotlin.resourceserver.infraestructure.repository

import com.orecic.kotlin.resourceserver.domain.entity.CoffeeShopEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "coffeeshops", path = "coffeeshops")
interface CoffeeShopRepository : CrudRepository<CoffeeShopEntity, Long> {
}