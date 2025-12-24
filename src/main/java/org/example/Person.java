package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private double salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String email, String phone) {
        this(firstName, lastName, age);
        this.email=email;
        this.phone=phone;
        this.salary=0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if(age >= 13 && age<=19){
            return true;
        }
        return false;
    }
}
