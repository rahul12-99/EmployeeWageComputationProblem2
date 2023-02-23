package com.employeewage;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;//constants
        double empCheck = Math.floor((Math.random() * 10) % 2);
        System.out.println(empCheck);
        if(IS_FULL_TIME==empCheck){
            System.out.println("Employee is full time.");
        }else {
            System.out.println("Employee is absent.");
        }
    }
}
