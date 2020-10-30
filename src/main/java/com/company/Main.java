package com.company;

public class Main {
    public static void main(String[] args) {
        Person larry = new Person(147);
        System.out.println(larry.height);
        Person jim = new Person(194);
        System.out.println(jim.height + " " + jim.name);
        Person kirill = new Person(180, "Kirill");
        Person polina = new Person(165, "Polina");
        Person dima = new Person("Dima");
        dima.say("Artem");
        System.out.println(kirill.name + "\'s height is " + kirill.height);
        System.out.println(polina.name + "\'s height is " + polina.height);
        System.out.println();
        Student Oldman = new Student(150 , "Oleg" , 2);
        Oldman.tell();
        Student freshman = new Student(189, "Alex");
        freshman.tell();
    }
}
