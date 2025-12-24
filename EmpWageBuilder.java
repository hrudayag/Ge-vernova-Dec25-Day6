import java.util.Random;
class EmpWageBuilder {
    // UC-1, UC-3 constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    // UC-2, UC-3 assumptions
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;
    // UC-9 instance variables
    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalMonthlyWage;
    // Constructor (UC-8, UC-9)
    EmpWageBuilder(String companyName, int wagePerHour,
                   int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
    public void computeEmployeeWage() {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        totalMonthlyWage = 0;
        Random random = new Random();
        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {
            totalWorkingDays++;
            // UC-1: Attendance check
            int empType = random.nextInt(3);
            int workingHours = 0;
            // UC-4: Switch case
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
            // UC-6: Max hours check
            if (totalWorkingHours + workingHours > maxWorkingHours) {
                workingHours = maxWorkingHours - totalWorkingHours;
            }
            totalWorkingHours += workingHours;
            // UC-2: Daily wage
            int dailyWage = workingHours * wagePerHour;
            totalMonthlyWage += dailyWage;
        }
    }
    // UC-9: getters
    public int getTotalMonthlyWage() {
        return totalMonthlyWage;
    }
    public String getCompanyName() {
        return companyName;
    }
}
