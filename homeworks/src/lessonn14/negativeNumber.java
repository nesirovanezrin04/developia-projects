package lessonn14;

public class negativeNumber {

	    public static void main(String[] args) {
	        try {
	            NegativeNumber(-5); 
	        } catch (IllegalArgumentException exc) {
	            System.out.println("exception: " + exc.getMessage());
	        }
	    }

	    public static void NegativeNumber(int number) {
	        if (number < 0) {
	            throw new IllegalArgumentException(number+" menfidir");
	        } else {
	            System.out.println(number+" menfi deyil");
	        }
	    }
	}