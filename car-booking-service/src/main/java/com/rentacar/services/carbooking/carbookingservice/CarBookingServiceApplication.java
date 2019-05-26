package com.rentacar.services.carbooking.carbookingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
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
@EnableFeignClients
@EnableSwagger2
@EnableCircuitBreaker
public class CarBookingServiceApplication {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2.SWAGGER_2).groupName("CarBookingservice").select()
                .apis(RequestHandlerSelectors.basePackage("com.rentacar.services.carbooking"))
                .paths(PathSelectors.any()).build().apiInfo(new ApiInfo("Car Booking Services",
                        "A set of services to provide information about cars and User", "1.0.0", null,
                        new Contact("Sonali", "", null),null, null));
    }
    public static void main(String[] args) {
        SpringApplication.run(CarBookingServiceApplication.class, args);
    }

}
