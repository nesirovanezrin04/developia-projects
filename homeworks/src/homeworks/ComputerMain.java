package homeworks;

public class ComputerMain {
	public static void main(String[] args) {
		Computer Computer1=new Computer();
		Computer1.id=1;
		Computer1.brand="Apple";
		Computer1.model="Macbook Pro";
        Computer1.color="Gray";
		
        System.out.println(Computer1.id);
		System.out.println(Computer1.brand);
		System.out.println(Computer1.model);
		System.out.println(Computer1.color);
        Computer Computer1_2=new Computer("Macbook Pro");
        Computer Computer1_3=new Computer("Macbook Pro","Gray");
        
        System.out.println();
        
        Computer Computer2=new Computer();
		Computer2.id=2;
		Computer2.brand="Dell";
		Computer2.model="XPS 13";
        Computer2.color="Silver";
        
        Computer Computer2_2=new Computer("XPS 13");
        Computer Computer2_3=new Computer("XPS 13","Silver");
        
        System.out.println();
        Computer Computer3=new Computer();
		Computer3.id=3;
		Computer3.brand="HP";
		Computer3.model="Spectre x360";
        Computer3.color="Black";
        
        Computer Computer3_2=new Computer("XPS 13");
        Computer Computer3_3=new Computer("XPS 13","Black");
        
        
        
        
	}

}