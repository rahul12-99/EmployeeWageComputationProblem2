package com.employeewage;

public interface IEmployeeWage {
    public void addCompanyEmployeeWage(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);

    public void computeEmployeeWage();
}
