package main;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = new Parrot();
        parrot.setName("Kiki");

        Supplier<Parrot> parrotSuplier = () -> parrot;

        context.registerBean(
                "parrot1", // имя бина - можно опустить
                Parrot.class, // тип бина
                parrotSuplier // supplier, возвращающий экземпляр объекта, который добавляется в контекст
        );

        var p = context.getBean(Parrot.class);
        System.out.println("Hello " + p.getName());
    }
}
