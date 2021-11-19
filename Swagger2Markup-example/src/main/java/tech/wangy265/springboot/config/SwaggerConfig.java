package tech.wangy265.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.*;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * swagger config.
 *
 * @author wang
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	 @Bean
	    public Docket createRestApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("tech.wangy265.springboot.controller"))
	                .paths(PathSelectors.any())
	                .build();
	    }

	/**
	 * @return api info
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Swagger API").description("test api")
				.contact(new Contact("wang", "url", "email")).termsOfServiceUrl("host").version("1.0").build();
	}
}