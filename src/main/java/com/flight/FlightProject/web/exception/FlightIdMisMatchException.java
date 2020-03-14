package com.flight.FlightProject.web.exception;

public class FlightIdMisMatchException extends RuntimeException {
    public FlightIdMisMatchException(){
        super();
    }

    public FlightIdMisMatchException(final String message, final Throwable cause){
        super(message, cause);
    }

    public FlightIdMisMatchException(final String message){
        super(message);
    }

    public FlightIdMisMatchException(final Throwable cause){
        super(cause);
    }
}
