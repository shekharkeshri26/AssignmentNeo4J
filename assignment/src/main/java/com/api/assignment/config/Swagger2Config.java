package com.api.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.assignment.util.CommonConstants;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger Configuration
 * @author shekhar
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors
                .basePackage(CommonConstants.SWAGGER_BASE_PACKAGE))
            .paths(PathSelectors.regex("/.*"))
            .build().apiInfo(apiEndPointsInfo());
    }
    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title(CommonConstants.SWAGGER_TITLE)
            .description(CommonConstants.SWAGGER_DESCRIPTION)
            .license(CommonConstants.SWAGGER_LICENSE)
            .licenseUrl(CommonConstants.SWAGGER_LICENSE_URL)
            .version(CommonConstants.SWAGGER_VERSION)
            .build();
    }
}
