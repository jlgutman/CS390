package lesson6.problem.taska;



import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<DeptEmployee> {

    @Override
    public int compare(DeptEmployee o1, DeptEmployee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
