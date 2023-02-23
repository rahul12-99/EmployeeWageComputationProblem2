package com.employeewage;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;//constants
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        //Variables
        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;
        for (int i = 0; i < NO_OF_WORKING_DAYS; i++) {
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (empCheck) { //checking if part-time
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME: //checking if full time or not
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalWage += empWage;
            System.out.println("Emp wage: " + empWage);
        }
        System.out.println("Total employee wage: " + totalWage);
    }
}
