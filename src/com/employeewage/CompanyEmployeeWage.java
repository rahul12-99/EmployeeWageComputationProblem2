package com.employeewage;

public class CompanyEmployeeWage {
    public final String Company;
    public final int empRatePerHour;
    public final int noOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public CompanyEmployeeWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        this.Company = company;
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for " + Company + " = " + totalEmpWage;
    }
}
