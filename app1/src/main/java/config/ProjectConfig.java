package config;

import model.Parrot;
import model.Pirate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");

        return p;
    }

    @Bean
    Pirate pirate() {
        var p = new Pirate();
        p.setName("Joe");
        p.setParrot(parrot()); // создание ссылки из бина pirate на бин parrot

        return p;
    }

}
