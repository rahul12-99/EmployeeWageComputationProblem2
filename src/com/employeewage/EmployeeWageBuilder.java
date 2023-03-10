package com.employeewage;

public class EmployeeWageBuilder implements IEmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    CompanyEmployeeWage[] companyEmpWageArray = new CompanyEmployeeWage[5];

    @Override
    public void addCompanyEmployeeWage(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmployeeWage(Company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    @Override
    public void computeEmployeeWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmployeeWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmployeeWage(CompanyEmployeeWage companyEmpWage) {
        int empHrs , totalWorkingDays = 0, totalEmpHrs = 0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
                totalWorkingDays < companyEmpWage.noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        EmployeeWageBuilder employeeWage = new EmployeeWageBuilder();
        System.out.println("Welcome to employee wage calculator");
        employeeWage.addCompanyEmployeeWage("D-Mart", 23, 27, 80);
        employeeWage.addCompanyEmployeeWage("Reliance", 25, 20, 90);
        employeeWage.computeEmployeeWage();
    }
}
