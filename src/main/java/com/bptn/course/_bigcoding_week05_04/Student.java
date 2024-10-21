package com.bptn.course._bigcoding_week05_04;

public class Student {

    // Create instance variables int id, String name, and int age
    private int id;
    private String name;
    private int age;

    //Define a constructor that takes three arguments (id, name, and age)
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Define a getter method for the id field
    public int getId() {
        return id;
    }

    // Define a getter method for the name field
   public String getName() {
        return name;
    }


   // Define a getter method for the age field
    public int getAge() {
        return age;
    }


   
    //toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
The code has successfully convert the List into a Map with the student ID as the key and student object as the value. 

Applying method references (e.g., Student::getId) and lambda expressions 
(e.g., student -> student) was a significant part of this task, as they are crucial when working 
with Java Streams.

I had a challenge to properly set this line of code
 Map<Integer, Student> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getId, student -> student));
        return studentMap;

its mainly due to missing/error on streams and Collectors.
*/