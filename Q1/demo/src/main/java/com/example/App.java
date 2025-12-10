package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full-time employee name:");
        String ftName = scanner.nextLine();
        System.out.println("Enter full-time employee ID:");
        long ftId = scanner.nextLong();
        System.out.println("Enter monthly salary:");
        double monthlySalary = scanner.nextDouble();
        scanner.nextLine(); 

        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(ftName, ftId, monthlySalary);
        
        System.out.println("\nFull-Time Employee Info:");
        fullTimeEmp.displayInfo();
        System.out.println("Salary: " + fullTimeEmp.calculateSalary());

        System.out.println("\nEnter hourly employee name:");
        String hrName = scanner.nextLine();
        System.out.println("Enter hourly employee ID:");
        int hrId = scanner.nextInt();
        System.out.println("Enter hourly rate:");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Enter hours worked:");
        int hoursWorked = scanner.nextInt();

        HourlyEmployee hourlyEmp = new HourlyEmployee(hrName, hrId, hourlyRate, hoursWorked);

        System.out.println("\nHourly Employee Info:");
        hourlyEmp.displayInfo();
        System.out.println("Salary: " + hourlyEmp.calculateSalary());

        scanner.close();
    }
}

