package com.employeewage;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private static void dailyWageOfEmployee(String company, int wage, int numOfWorkingDays, int workingHourPerMonth) {
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalWage, empHrs;
        while (totalWorkingDays < numOfWorkingDays && totalEmpHrs < workingHourPerMonth) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        totalWage = totalEmpHrs * wage;
        System.out.println("Employee Wage for " + company + " is = " + totalWage);
    }

    public static void main(String[] args) {
        dailyWageOfEmployee("Reliance", 30, 2, 20);
        dailyWageOfEmployee("V-Mart", 40, 4, 40);
        dailyWageOfEmployee("D-Mart", 22, 3, 60);
    }
}
