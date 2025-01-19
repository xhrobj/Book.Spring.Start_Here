package model;

public class Pirate {
    private String name;
    private Parrot parrot;

    public Pirate() {
        System.out.println("-> Pirate created");
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
