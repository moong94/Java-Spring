package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("hihihihi");
		System.out.println(Employee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("kikikiki");
		
		System.out.println(employeeLee.getEmployeeName() + "의 사번은 " + employeeLee.getEmployeeId());

		System.out.println(employeeKim.getEmployeeName() + "의 사번은 " + employeeKim.getEmployeeId());
	}

}
