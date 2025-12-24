import java.util.ArrayList;
import java.util.Random;
class EmpWageBuilder implements IEmpWageBuilder {
    // UC-1, UC-3 constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    // UC-2, UC-3 assumptions
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;
    // UC-12: ArrayList instead of array
    private ArrayList<CompanyEmpWage> companies;
    // UC-12 constructor
    EmpWageBuilder() {
        companies = new ArrayList<>();
    }
    // UC-11: interface method
    @Override
    public void addCompany(String companyName, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours) {

        companies.add(new CompanyEmpWage(
                companyName, wagePerHour,
                maxWorkingDays, maxWorkingHours));
    }
    @Override
    public void computeEmployeeWages() {

        for (CompanyEmpWage company : companies) {
            computeCompanyWage(company);
        }
    }
    private void computeCompanyWage(CompanyEmpWage company) {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        company.totalMonthlyWage = 0;

        Random random = new Random();

        while (totalWorkingDays < company.maxWorkingDays &&
                totalWorkingHours < company.maxWorkingHours) {

            totalWorkingDays++;

            int empType = random.nextInt(3);
            int workingHours = 0;

            switch (empType) {
                case IS_FULL_TIME:
                    workingHours = FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    workingHours = PART_TIME_HOUR;
                    break;
                default:
                    workingHours = 0;
            }

            if (totalWorkingHours + workingHours > company.maxWorkingHours) {
                workingHours = company.maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += workingHours;
            company.totalMonthlyWage += workingHours * company.wagePerHour;
        }
        System.out.println(company.companyName +
                " Total Wage: " + company.totalMonthlyWage);
    }
}
