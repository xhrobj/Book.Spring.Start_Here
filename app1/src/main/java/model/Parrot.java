package model;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";
    private Pirate owner;

    public Parrot(Pirate owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\uD83E\uDD9C {" +
                "name = '" + name + '\'' +
                '}';
    }
}
