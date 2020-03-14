package com.flights.FlightProject;

import org.apache.catalina.connector.Response;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import static org.junit.Assert.assertEquals;

public class SpringBootBootstrapLiveTest {
    private static final String API_ROOT = "http://localhost:8080/api/books";

    @Test
    public void whenGetAllBooks_thenOK(){
        final Response response = RestAssured.get(API_ROOT);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }

    public void whenGetBookByTitle_then_OK(){
        final Book  book = createRandomBook();
        createBookAsUriBook
    }
}
