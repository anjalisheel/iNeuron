public class Program {

    public static void main(String[] args) {
        Employee emp = new Employee("abc", 101);

        SalaryCalculator sc = new SalaryCalculator();
        sc.calculateSalary(emp);

        EmployeeHiring eh = new EmployeeHiring();
        eh.hireEmployees(emp);

        EmployeeEvaluator ee = new EmployeeEvaluator();
        ee.evaluateEmployees(emp);
    }
}
