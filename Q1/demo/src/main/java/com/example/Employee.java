package com.example;

public abstract class Employee {

    protected final String name;
    protected final long id;

    protected Employee (String name, long id){
        this.name = name;
        this.id = id ;
    }

    public void displayInfo(){
        System.out.println("name :" + name);
        System.out.println("id :" + id);
    }

    public abstract double calculateSalary();
}

