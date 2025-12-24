import java.util.ArrayList;
class CompanyEmpWage {
    String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalMonthlyWage;
    // UC-13
    ArrayList<Integer> dailyWages;
    CompanyEmpWage(String companyName, int wagePerHour,
                   int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
    }
}