package com.orecic.kotlin.resourceserver.infraestructure.configuration

import com.orecic.kotlin.resourceserver.domain.entity.CoffeeShopEntity
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

@Configuration
class RestConfiguration : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
        config?.exposeIdsFor(CoffeeShopEntity::class.java)
        config?.setBasePath("/api")
    }

}