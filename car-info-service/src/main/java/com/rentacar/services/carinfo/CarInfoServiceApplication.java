package com.rentacar.services.carinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class CarInfoServiceApplication {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2.SWAGGER_2).groupName("Carinfoservice").select()
                .apis(RequestHandlerSelectors.basePackage("com.rentacar.services.carinfo"))
                .paths(PathSelectors.any()).build().apiInfo(new ApiInfo("Car Info Services",
                        "A set of services to provide information about cars", "1.0.0", null,
                        new Contact("Sonali", "", null),null, null));
    }

    public static void main(String[] args) {
        SpringApplication.run(CarInfoServiceApplication.class, args);
    }

}
