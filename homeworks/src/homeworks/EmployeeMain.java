package homeworks;

public class EmployeeMain {
public static void main(String[] args) {
	Employee Employee1=new Employee();
	Employee1.id=10;
	Employee1.name="Aylin";
	Employee1.surname="Memmedzade";
	Employee1.phone="0554749869";
	Employee1.address="Baku";
	Employee1.salary=454;
	
	System.out.println(Employee1.id);
	System.out.println(Employee1.name);
	System.out.println(Employee1.surname);
	System.out.println(Employee1.phone);
	System.out.println(Employee1.address);
	System.out.println(Employee1.salary);
	Employee Employee1_1=new Employee("Aylin");
	Employee Employee1_2=new Employee("Aylin","Memmedzade");
	Employee Employee1_3=new Employee("0554749869",454);
	
    System.out.println();
    
    Employee Employee2=new Employee();
	Employee2.id=11;
	Employee2.name="Aytac";
	Employee2.surname="Ahmedli";
	Employee2.phone="0554479899";
	Employee2.address="Shaki";
	Employee2.salary=600;
	
	Employee Employee2_1=new Employee("Aytac");
	Employee Employee2_2=new Employee("Aytac","Ahmedli");
	Employee Employee2_3=new Employee("0554479899",600);
	
    System.out.println();
    
	Employee Employee3=new Employee();
	Employee3.id=12;
	Employee3.name="Emin";
	Employee3.surname="Recebov";
	Employee3.phone="0553697414";
	Employee3.address="Agsu";
	Employee3.salary=370;
	
	Employee Employee3_1=new Employee("Emin");
	Employee Employee3_2=new Employee("Emin","Recebov");
	Employee Employee3_3=new Employee("0553697414",370);
	
    System.out.println();
    
	Employee Employee4=new Employee();
	Employee4.id=13;
	Employee4.name="Resul";
	Employee4.surname="Eminov";
	Employee4.phone="0556997844";
	Employee4.address="Ganja";
	Employee4.salary=650;
	
	Employee Employee4_1=new Employee("Resul");
	Employee Employee4_2=new Employee("Resul","Eminov");
	Employee Employee4_3=new Employee("0556997844",650);


    

    
}
}
