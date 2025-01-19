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
    Pirate pirate(Parrot friend) {
        var p = new Pirate();
        p.setName("Joe");
        p.setParrot(friend); // Spring внедряет (DI - dependency injection) бин parrot в этот параметр

        return p;
    }

}
