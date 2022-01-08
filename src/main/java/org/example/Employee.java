package org.example;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    public Employee(String n,double s,int year,int month,int day){
        this.name = n;
        this.salary = s;
        this.hireDate = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent /100;
        this.salary += raise;
    }
}
