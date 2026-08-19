package com.shaik.spring.cloud.apigateway1.spring_cloud_apigateway1.filter;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingFilter {

    @Bean
    public GlobalFilter loggingGlobalFilter() {

        return (exchange, chain) -> {

            System.out.println(
                    "Incoming Request => "
                            + exchange.getRequest().getMethod()
                            + " "
                            + exchange.getRequest().getURI());

            return chain.filter(exchange);
        };
    }
}
