package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pirate {
    private String name = "Ella";
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Очень редко используемый способ
    // NOTE: какая-то магия! Сеттер явно нигде не вызывается, но свойство устанавливается
    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "\uD83E\uDD20 {" +
                "name = '" + name + '\'' +
                ", parrot = " + parrot +
                '}';
    }
}
