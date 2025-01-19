package model;

import org.springframework.stereotype.Component;

@Component
public class Pirate {
    private String name = "Ella";
    private Parrot parrot;

    public Pirate(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

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
