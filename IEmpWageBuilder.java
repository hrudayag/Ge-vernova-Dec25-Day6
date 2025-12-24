interface IEmpWageBuilder {
    void addCompany(String companyName, int wagePerHour,
                    int maxWorkingDays, int maxWorkingHours);

    void computeEmployeeWages();
}
