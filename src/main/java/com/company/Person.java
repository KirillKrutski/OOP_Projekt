package com.company;

public class Person {
    public int height;
    public String name = "Default";
    public void say(String name) { // метод "говорить"
        System.out.println("Hello " + name);
    }
    public Person() { // конструктор по умолчанию
    }
    public Person(int h) { // конструктор с параметром height(h)
        height = h;
    }
    public Person(int h, String n) { // конструктор с параметром height(h) и name(n)
        height = h;
        name = n;
    }
    public Person(String n) { // конструктор с параметром name(n)
        name = n;
    }
}