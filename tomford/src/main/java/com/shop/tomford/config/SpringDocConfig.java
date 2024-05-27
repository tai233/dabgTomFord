package com.shop.tomford.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "User API",
                version = "1.0",
                description = "APIs for user management"
        )

)
public class SpringDocConfig {


}
