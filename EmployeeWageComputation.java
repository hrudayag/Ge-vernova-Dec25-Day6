import java.util.Random;
public class EmployeeWageComputation {
    // Attendance constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmployeeWage("GE Vernova", 20, 20, 100);
        System.out.println("----------------------------------");
        computeEmployeeWage("TCS", 25, 22, 110);
        System.out.println("----------------------------------");
        computeEmployeeWage("Infosys", 18, 20, 100);
    }
    // UC-8: Class Method with function parameters
    public static void computeEmployeeWage(
            String companyName,
            int wagePerHour,
            int maxWorkingDays,
            int maxWorkingHours) {
        Random random = new Random();
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalMonthlyWage = 0;
        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {
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
                case IS_ABSENT:
                    workingHours = 0;
                    break;
            }
            if (totalWorkingHours + workingHours > maxWorkingHours) {
                workingHours = maxWorkingHours - totalWorkingHours;
            }
            totalWorkingHours += workingHours;
            int dailyWage = workingHours * wagePerHour;
            totalMonthlyWage += dailyWage;

            System.out.println(companyName +
                    " : Day " + totalWorkingDays +
                    "  Hours = " + workingHours +
                    "  Daily Wage = " + dailyWage);
        }
        System.out.println("\nCompany: " + companyName);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
    }
}