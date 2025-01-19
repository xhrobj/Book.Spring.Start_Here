package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "Koko")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");

        return p;
    }

    @Bean(value = "Brewster")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Brewster");

        return p;
    }

    @Bean("Wilson")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Wilson");

        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer eleven() {
        return 11;
    }
}
