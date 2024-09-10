package homeworks;

public class Employee {
	int id;
	String name;
	String surname;
	String phone;
	String address;
	int salary;
	
	public Employee() {
	}
	public Employee(String n) {
	name=n;
	System.out.println(name);
	}
	
	public Employee(String n,String s) {
		name=n;
		surname=s;
		System.out.println(name+","+surname);
	}
	public Employee(String p,int s) {
		phone=p;
		salary=s;
		System.out.println(phone+","+salary);
	}
}
