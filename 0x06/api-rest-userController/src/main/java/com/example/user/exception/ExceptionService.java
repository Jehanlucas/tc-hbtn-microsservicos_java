package com.example.user.demo.exception;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler
    ResponseEntity<CPFException> handleException(CPFException err){
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.NOT_FOUND.value());
        user.setMessage("You have entered invalid CPF "+err.getMessage());
        return new ResponseEntity(user,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    ResponseEntity<UserIdException> handleException(UserIdException err) {
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.NOT_FOUND.value());
        user.setMessage("You have entered invalid ID "+ err.getMessage());
        return new ResponseEntity(user,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    ResponseEntity<UserNameException> handleException(UserNameException err) {
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.NOT_FOUND.value());
        user.setMessage("You have entered invalid user name "+err.getMessage());
        return new ResponseEntity(user,HttpStatus.NOT_FOUND);
    }
}