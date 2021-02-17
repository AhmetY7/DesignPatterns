package singletonex1;

public class Main {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton();
        Singleton singleton = Singleton.Instance();
        System.out.println(singleton.degerAl());
        singleton.degerYaz(20);

        Singleton u = Singleton.Instance();
        System.out.println(u.degerAl());
    }
}
