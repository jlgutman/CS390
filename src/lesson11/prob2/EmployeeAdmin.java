package lesson11.prob2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
        List<Employee> result = new ArrayList<>();
        if (table == null || table.isEmpty() || socSecNums == null || socSecNums.isEmpty()) return result;

        table.forEach((k, val) -> {
            if (socSecNums.contains(k) && val != null && val.getSalary() > 80000)
                result.add(val);
        });
        result.sort((e1, e2) -> e1.getSsn().compareTo(e2.getSsn()));
		return result;
		
	}
	
}
