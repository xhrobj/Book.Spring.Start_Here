package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

    private Pirate owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pirate getOwner() {
        return owner;
    }

    @Autowired
    public void setOwner(Pirate owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "\uD83E\uDD9C {" +
                "name = '" + name + '\'' +
                '}';
    }
}
