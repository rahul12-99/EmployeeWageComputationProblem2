package com.employeewage;

public class CompanyEmployeeWage {
    public final String company;
    public final int ratePerHour;
    public final int noOfWorkingDays;
    public final int maxWorkingHours;
    public int totalEmpWage;

    public CompanyEmployeeWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void setTotalEmpWage (int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total employee wage for company " + company + " is " + totalEmpWage;
    }
}
