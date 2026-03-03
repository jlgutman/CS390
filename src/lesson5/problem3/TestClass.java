package lesson5.problem3;

import java.util.Arrays;

public class TestClass {
    void main() {
        Employee e1 = new CommissionEmployee("Joe", "Gutman", "123-456-789", 30000.0, 10);
        Employee e2 = new HourlyEmployee("Jose", "Gutierrez", "123-456-789", 90.5, 40);
        Employee e3 = new SalariedEmployee("John", "Smith", "123-456-789", 2000);
        Employee e4 = new BasePlusCommissionEmployee("Sarah", "Johnson", "123-456-789", 20000.0, 2, 7000);
        Employee e5 = new HourlyEmployee("Mark", "Smith", "123-456-789", 50, 40);
        Employee[] employees = {e1, e2, e3, e4, e5, null};
        Employee[] result = findSalaryList(employees, 4000);
        for (Employee e : result) {
            System.out.println(e.toString());
        }
    }

    public static Employee[] findSalaryList (Employee[] col, double salary) {
        if (col == null || col.length == 0) return new Employee[0];
        Employee[] employees = new Employee[col.length];
        int j = 0;
        for (Employee e : col) {
            if (e != null && e.getPayment() < salary){
                employees[j++] = e;
            }
        }

        return Arrays.copyOf(employees, j);
    }
}
