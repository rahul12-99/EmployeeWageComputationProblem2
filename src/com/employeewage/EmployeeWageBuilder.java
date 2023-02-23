package com.employeewage;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;//constants
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int NO_OF_WORKING_HOURS = 50;

    public static void main(String[] args) {
        //Variables
        int empHrs = 0;
        int totalHrs = 0;
        int totalWorkingDays = 0;
        while (totalHrs <= NO_OF_WORKING_HOURS && totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;

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
            totalHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " " + "Emp hr: " + totalHrs);
        }
        int totalWage = totalHrs * totalWorkingDays;
        System.out.println("Total employee wage: " + totalWage);

    }
}
