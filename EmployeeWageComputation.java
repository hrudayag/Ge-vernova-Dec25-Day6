import java.util.Random;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWageBuilder ge = new EmpWageBuilder("GE Vernova", 20, 20, 100);
        EmpWageBuilder tcs = new EmpWageBuilder("TCS", 25, 22, 110);
        ge.computeEmployeeWage();
        tcs.computeEmployeeWage();
        System.out.println(ge.getCompanyName() +
                " Total Wage: " + ge.getTotalMonthlyWage());
        System.out.println(tcs.getCompanyName() +
                " Total Wage: " + tcs.getTotalMonthlyWage());
    }
}