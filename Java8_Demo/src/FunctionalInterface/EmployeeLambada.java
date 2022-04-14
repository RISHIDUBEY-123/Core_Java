package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	int eno;
	String ename;
	Employee(int eno,String ename){
		this.eno=eno;
		this.ename=ename;
	}
    public String toString() {
    	return "Eno :"+eno+" "+"Ename : "+ename;
    }
	
}

class EmployeeLambada {

	public static void main(String[] args) {
    ArrayList<Employee> al=new ArrayList<Employee>();
    al.add(new Employee(100,"Deepak"));
    al.add(new Employee(80,"Depankar"));
    al.add(new Employee(40,"Rohit"));
    al.add(new Employee(120,"Pankaj"));
    al.add(new Employee(200,"Mohit"));
    al.add(new Employee(140,"Praneet"));
    System.out.println("Lambada Before Sorting : "+ al);
    Collections.sort(al,(e1,e2) -> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
    System.out.println("Lambada After Sorting : " + al);
    
	}

}
