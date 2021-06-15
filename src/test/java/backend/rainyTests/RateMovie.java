package backend.rainyTests;

import config.Constants;
import helpers.backend.PostRequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

public class RateMovie {

    @Test
    public void getErrorForInvalidMovieId()

    {
        Double value = 6.0; //to be improved as a random value
        String movieId = "00test00"; //to be improved as a random value
        Responses.validate404ErrorResponse(Requests.postRequest(new PostRequestBody(value), String.format(Constants.Endpoints.RATING, movieId, Constants.Stubs.API_KEY)));
    }

    @Test
    public void getErrorForEmptyMovieId()

    {
        Double value = 7.0; //to be improved as a random value
        String movieId = "";
        Responses.validate404ErrorResponse(Requests.postRequest(new PostRequestBody(value), String.format(Constants.Endpoints.RATING, movieId, Constants.Stubs.API_KEY)));
    }

    @Test
    public void getErrorForInvalidApiKey() // extra field specified in response example

    {
        Double value = 8.0; //to be improved as a random value
        String apiKey = "00test00"; //to be improved as a random value
        Responses.validate401ErrorResponse(Requests.postRequest(new PostRequestBody(value), String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, apiKey)));
    }

    @Test
    public void getErrorForEmptyApiKey() // extra field specified in response example

    {
        Double value = 9.5; //to be improved as a random value
        String apiKey = "";
        Responses.validate401ErrorResponse(Requests.postRequest(new PostRequestBody(value), String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, apiKey)));
    }

    @Test
    public void getErrorForInvalidTooLowValue() // behaviour not specified

    {
        Double value = 0.1;
        Responses.validateStatusResponseNoDetails(Requests.postRequest(new PostRequestBody(value), String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, Constants.Stubs.API_KEY)), 400);
    }

    @Test
    public void getErrorForInvalidTooHighValue() // behaviour not specified

    {
        Double value = 1000.5;
        Responses.validateStatusResponseNoDetails(Requests.postRequest(new PostRequestBody(value), String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, Constants.Stubs.API_KEY)), 400);
    }
}
