package com.appdirect.subscription.api.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.appdirect.subscription.api.model.SubscriptionErrorEnum;
import com.appdirect.subscription.api.model.SubscriptionResponse;
import com.appdirect.subscription.business.exception.AccountNotFoundException;
import com.appdirect.subscription.business.exception.UnknownErrorException;
import com.appdirect.subscription.business.exception.UserAlreadyExistsException;
import com.appdirect.subscription.business.exception.UserNotFoundException;

@ControllerAdvice
public class AppDirectExceptionHandler extends ResponseEntityExceptionHandler {

    public AppDirectExceptionHandler() {
        super();
    }

    @ExceptionHandler({ UserAlreadyExistsException.class })
    public ResponseEntity<Object> handleBadRequest(final UserAlreadyExistsException ex, final WebRequest request) {
        SubscriptionResponse response = 
        		new SubscriptionResponse(null, false, SubscriptionErrorEnum.USER_ALREADY_EXISTS.getErrorCode(), 
        				SubscriptionErrorEnum.USER_ALREADY_EXISTS.getDescription());
        
        return new ResponseEntity<Object>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ UserNotFoundException.class })
    public ResponseEntity<Object> handleBadRequest(final UserNotFoundException ex, final WebRequest request) {
    	 SubscriptionResponse response = 
         		new SubscriptionResponse(null, false, SubscriptionErrorEnum.USER_NOT_FOUND.getErrorCode(), 
         				SubscriptionErrorEnum.USER_NOT_FOUND.getDescription());
    	 return new ResponseEntity<Object>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = { AccountNotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(final AccountNotFoundException ex, final WebRequest request) {
    	SubscriptionResponse response = 
         		new SubscriptionResponse(null, false, SubscriptionErrorEnum.ACCOUNT_NOT_FOUND.getErrorCode(), 
         				SubscriptionErrorEnum.ACCOUNT_NOT_FOUND.getDescription());
    	 return new ResponseEntity<Object>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = { UnknownErrorException.class})
    protected ResponseEntity<Object> handleNotFound(final UnknownErrorException ex, final WebRequest request) {
    	SubscriptionResponse response = 
         		new SubscriptionResponse(null, false, SubscriptionErrorEnum.UNKNOWN_ERROR.getErrorCode(), 
         				SubscriptionErrorEnum.UNKNOWN_ERROR.getDescription());
    	 return new ResponseEntity<Object>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

}
