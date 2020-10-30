package com.company;

public class Student extends Person {
    int course = 1;
    public Student (int height , String name , int course){
        super(height,name); // с помощью super мы обращаемся к полям класса Person
        this.course = course; // с помощью this мы обращаемся на прямую к полю course , созданного в строке 4
    }
    public Student(int height , String name){
        super(height,name);
    }
    public void tell (){
        System.out.println(super.height + " " + super.name + " " + course);
    }
}
