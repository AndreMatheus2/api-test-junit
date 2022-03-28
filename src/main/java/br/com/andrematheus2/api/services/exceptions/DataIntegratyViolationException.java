package br.com.andrematheus2.api.services.exceptions;

public class DataIntegratyViolationException extends RuntimeException{

    public DataIntegratyViolationException(String message) {
        super(message);
    }

}