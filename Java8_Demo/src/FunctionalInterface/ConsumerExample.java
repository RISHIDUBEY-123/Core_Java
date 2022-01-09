package FunctionalInterface;
import java.util.function.*;
import data.*;
import java.util.*;

public class ConsumerExample {

	public static void studentDetails() {
		Consumer<Student> c2=(student) -> System.out.println(student);
		List<Student> studentList=StudentDataBase.getAllStudents();
		studentList.forEach(c2);
		
	}
	public static void getStudentActivities() {
		Consumer<Student> c3=(student) ->  System.out.println(student.getName());
		Consumer<Student> c4=(student) ->  System.out.println(student.getActivities());
		List<Student> getActivity=StudentDataBase.getAllStudents();
		getActivity.forEach(c3.andThen(c4));
	
	}
	public static void main(String[] args) {
		
		Consumer<String> c1=(s) -> System.out.println(s.toUpperCase());
        
		c1.accept("java8");
		studentDetails();
		getStudentActivities();
	}

}
