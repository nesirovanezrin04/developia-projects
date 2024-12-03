package az.developia.librarian_nezrin_nesirova.exception;

import org.springframework.validation.BindingResult;

import lombok.Data;

@Data
public class MyException extends RuntimeException {

	private BindingResult br;

	public MyException(String message, BindingResult br) {
		super(message);
		this.br = br;

	}

	public BindingResult getBr() {
		return br;
	}

	public void setBr(BindingResult br) {
		this.br = br;
	}
	
	
	
}
