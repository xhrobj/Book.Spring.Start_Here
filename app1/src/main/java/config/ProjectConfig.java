package config;

import model.Parrot;
import model.Pirate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Wilson");
        return p;
    }

    @Bean
    // NOTE: с помощью аннотации @Qualifier явно указывает какой бин из контекста следует внедрить
    public Pirate person(@Qualifier("parrot2") Parrot parrot) {
        Pirate p = new Pirate();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
