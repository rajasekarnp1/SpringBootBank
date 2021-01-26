package com.lamda.test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LamdaTest {
	
	public void lamdaOperation() {
		System.out.println(" -----");
		IntStream.range(1, 100).forEach(System.out::println);
		List<Employee> empList =constructEmp();
		List<Employee> empList1 =constructEmp();
		List<Employee> managerList =constructEmp();
		List<Employee> employeeList =constructEmp();
		List<Employee> empExpList =constructEmp();
		System.out.println("top 10 values");
		empList1= empList.stream().sorted((e1,e2) -> e2.getJoiningDate().compareTo(e1.getJoiningDate())).collect(Collectors.toList()).subList(1, 10);
		empList1.forEach(e->System.out.println(e));
		System.out.println(" -----");
		System.out.println("DNACandidate for Employees having experience >7 yrs");
		empExpList = empList.stream().filter(e->e.getExp()>7).collect(Collectors.toList());
		System.out.println("Manager list ");
		empExpList.forEach(e->System.out.println(e));
		managerList = empList.stream().filter(e->e.isManager()).collect(Collectors.toList());
		managerList.forEach(e->System.out.println(e));

		
	}
	
	public List<Employee> constructEmp() {
		List<Employee> employeeList = new ArrayList<>();
		LocalDate date = LocalDate.now();  
		LocalDateTime localDateJoiingTIme = LocalDateTime.now();  
		Employee emp = new Employee(1, "rajasekar", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(12).minusMonths(36));
		Employee emp1 = new Employee(2, "sathish", 10000, date.minusDays(1000), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(12).minusMonths(11));
		Employee emp2 = new Employee(3, "baskar", 10000, date.minusDays(1000), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(10).minusMonths(11));
		Employee emp3 = new Employee(4, "satheeh", 10000, date.minusMonths(4), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(15).minusMonths(11));
		Employee emp4 = new Employee(5, "kiran", 10000, date.minusMonths(34), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(18).minusMonths(5));
		Employee emp5 = new Employee(6, "kurijiji", 10000, date.minusMonths(54), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(1).minusSeconds(30));
		Employee emp6 = new Employee(7, "booby", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(5).minusYears(10));
		Employee emp7 = new Employee(8, "venkat", 10000, LocalDate.now(), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(3).minusDays(300));
		Employee emp8 = new Employee(9, "kalai", 10000, LocalDate.now(), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(2).minusYears(5));
		
		
		Employee emp9 = new Employee(16, "madha", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(12).minusDays(500));
		Employee emp10 = new Employee(16, "srini", 10000, date.minusMonths(20), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(52).minusMonths(55));
		Employee emp11 = new Employee(15, "sathya", 10000, date.minusYears(4), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(7).minusMinutes(66));
		Employee emp12 = new Employee(14, "mono", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(9).minusHours(37));
		Employee emp13 = new Employee(13, "mohan", 10000, date.minusYears(8), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(9).minusYears(5));
		Employee emp14 = new Employee(12, "viki", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(8).minusMonths(22));
		Employee emp15 = new Employee(11, "vimalan", 10000,date.minusYears(10), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(7).minusYears(10));
		Employee emp16 = new Employee(10, "vikram", 10000, date.minusYears(3), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(7).minusYears(12));
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);
		employeeList.add(emp9);
		employeeList.add(emp10);
		
		employeeList.add(emp11);
		employeeList.add(emp12);
		employeeList.add(emp13);
		employeeList.add(emp14);
		employeeList.add(emp15);
		employeeList.add(emp16);
		
		return employeeList;
	}
	
	
	public static void main(String[] args) {
		IntStream.range(1, 100).forEach(System.out::println);
		LamdaTest lamdaTest = new LamdaTest();
		lamdaTest.lamdaOperation();
		
	}

}
