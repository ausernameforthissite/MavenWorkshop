package ru.eltex.home.service;

import ru.eltex.home.utils.Man;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from service");

        Man man = new Man("Anonymous");
        System.out.println(man.getName());
    }
}
