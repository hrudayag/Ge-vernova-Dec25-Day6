interface IEmpWageBuilder {
    void addCompany(String companyName, int wagePerHour,
                    int maxWorkingDays, int maxWorkingHours);

    void computeEmployeeWages();
    // UC-14
    int getTotalWage(String companyName);
}
