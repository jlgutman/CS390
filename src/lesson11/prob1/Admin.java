package lesson11.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
        HashMap<Key, Student> map = new HashMap<>();
        if (students == null || students.isEmpty()) return map;

        students.forEach(s -> map.put(new Key(s.getFirstName(), s.getLastName()), s));
		return map;
	}
}
