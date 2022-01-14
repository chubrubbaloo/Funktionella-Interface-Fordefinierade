package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    private final String name;
    private final int age;
    private final int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        Comparator<Employee> sortBySalary = (e1,e2) -> e2.getSalary() - e1.getSalary();
      //  Comparator<Employee> sortByAge = (e1,e2) -> e2.getSalary() - e1.getSalary();

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Emil", 30, 33_000),
                new Employee("Kim", 45, 50_000),
                new Employee("Denis", 22,25_000)
        ));

        employees.sort(sortBySalary);
        employees.forEach(System.out::println);

/*
        Predicate<String> checkFirstLetter = str -> str.startsWith("H");
        if (checkFirstLetter.test("Haris")) {
            System.out.println("It's a match!");
        } else System.out.println("No match.");

        Consumer<Integer> printMe = integer -> System.out.println(integer);
        printMe.accept(2000);

        Function<Integer, Integer> squared = integer -> integer * integer;
        System.out.println(squared.apply(10));

 */


    }
}
