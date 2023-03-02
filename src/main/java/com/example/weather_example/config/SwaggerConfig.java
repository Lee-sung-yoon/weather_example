package com.example.weather_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.weather_example")) // -> swagger에 나오는 error를 안나오게 하는법
                .paths(PathSelectors.any()) // -> any이면 모든 controller 나오게 한다. 만약 none으로 하면 아무 controller가 안나온다, ant는 특정 controller만 나오게 할 수 있다.
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        String description = "날씨 일기를 CRUD 할 수 있는 백엔드 API 입니다.";
        return new ApiInfoBuilder()
                .title("날씨 일기 프로젝트 :")
                .description(description)
                .version("2.0")
                .build();
    }
}
