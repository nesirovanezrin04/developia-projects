package homeworks;

public class PersonMain {
	public static void main(String[] args) {
		Person Person1=new Person();
		Person1.id=1;
		Person1.name="Arif";
		Person1.surname="Memmedov";
		Person1.age=18;
		Person1.phone="0517448594";
		System.out.println("Person1.id: "+Person1.id);
		System.out.println("Person1.name: "+Person1.name);
		System.out.println("Person1.surname: "+Person1.surname);
		System.out.println("Person1.age: "+Person1.age);
		System.out.println("Person1.phone: "+Person1.phone);

		System.out.println();
		
		Person Person2=new Person();
		Person2.id=2;
		Person2.name="Aynur";
		Person2.surname="Memmedli";
		Person2.age=20;
		Person2.phone="0515471421";
		System.out.println("Person2.id: "+Person2.id);
		System.out.println("Person2.name: "+Person2.name);
		System.out.println("Person2.surname: "+Person2.surname);
		System.out.println("Person2.age: "+Person2.age);
		System.out.println("Person2.phone: "+Person2.phone);
	}

}
