public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        // UC-11
        IEmpWageBuilder empWageBuilder = new EmpWageBuilder(3);
        empWageBuilder.addCompany("GE Vernova", 20, 20, 100);
        empWageBuilder.addCompany("TCS", 25, 22, 110);
        empWageBuilder.addCompany("Infosys", 18, 20, 100);
        empWageBuilder.computeEmployeeWages();
    }
}
