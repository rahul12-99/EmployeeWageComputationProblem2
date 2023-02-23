package com.employeewage;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;//constants
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor((Math.random() * 10) % 2);
        System.out.println(empCheck);
        if (IS_FULL_TIME == empCheck) { //checking if full time or not
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empWage);
    }
}
