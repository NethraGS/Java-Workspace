package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean("Movie1")
    public Movie getMovie1(){
        return new Movie();
    }
    @Bean("Movie2")
    public Movie getMovie2(){
        return new Movie();
    }

    @Bean("Car1")
    public Car getCar1(){
        return new Car();
    }
    @Bean("Car2")
    public Car getCar2(){
        return new Car();
    }
}
