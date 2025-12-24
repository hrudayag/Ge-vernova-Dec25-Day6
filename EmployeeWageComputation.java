public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        // UC-10: one builder managing multiple companies
        EmpWageBuilder builder = new EmpWageBuilder(3);

        builder.addCompany("GE Vernova", 20, 20, 100);
        builder.addCompany("TCS", 25, 22, 110);
        builder.addCompany("Infosys", 18, 20, 100);
        builder.computeEmployeeWages();
    }
}
