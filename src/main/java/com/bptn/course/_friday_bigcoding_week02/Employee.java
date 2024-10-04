package com.bptn.course._friday_bigcoding_week02;

public class Employee {

// Private instance variables to store salary and hours per day
private int salary;
private int hoursPerDay;

// Constructor to set instance variables using set methods
public Employee(int salary, int hoursPerDay) {
    setSalary(salary);
    setHoursPerDay(hoursPerDay);
}

// Set method to update salary with a condition
public void setSalary(int salary) {
    if (salary < 500) {
        this.salary = salary + 10; // Increase salary by 10 if less than 500
    } else {
        this.salary = salary;
    }
}

// Set method to update hoursPerDay and modify salary if hours per day is greater than 6
public void setHoursPerDay(int hoursPerDay) {
    this.hoursPerDay = hoursPerDay;
    if (hoursPerDay > 6) {
        this.salary += 5; // Increase salary by 5 if hoursPerDay > 6
    }
}

// Get method to return the salary
public int getSalary() {
    return this.salary;
}
}
