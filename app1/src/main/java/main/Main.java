package main;

import model.Parrot;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.setName("Jameson");

        System.out.println("Hello " + parrot.getName());
    }
}
