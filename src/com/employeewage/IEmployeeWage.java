package com.employeewage;

public interface IEmployeeWage {
    public void addCompanyEmployeeWage(String Company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth);

    public void computeEmployeeWage();
    public int getTotalWage(String Company );
}
