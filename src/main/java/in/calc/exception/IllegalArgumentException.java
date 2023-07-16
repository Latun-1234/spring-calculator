package in.calc.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class IllegalArgumentException extends RuntimeException {
	public IllegalArgumentException() {
		
	}
	public IllegalArgumentException(String message) {
		super(message);

}

	}


