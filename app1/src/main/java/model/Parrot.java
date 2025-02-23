package model;

import org.springframework.beans.factory.annotation.Autowired;

public class Parrot {
    private String name;

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
