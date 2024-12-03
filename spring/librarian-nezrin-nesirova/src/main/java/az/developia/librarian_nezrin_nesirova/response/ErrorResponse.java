package az.developia.librarian_nezrin_nesirova.response;

import java.util.List;

import org.springframework.validation.FieldError;

import lombok.Data;

@Data
public class ErrorResponse {
	private String message;
	private List<FieldError> validations;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<FieldError> getValidations() {
		return validations;
	}
	public void setValidations(List<FieldError> validations) {
		this.validations = validations;
	}
	
	

}
