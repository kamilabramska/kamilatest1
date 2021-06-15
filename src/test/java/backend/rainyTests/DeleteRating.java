package backend.rainyTests;

import config.Constants;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

public class DeleteRating {

    @Test
    public void deleteRating ()

    {
        Responses.validateDeleteRatingResponse(Requests.deleteRequest(String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, Constants.Stubs.API_KEY)));
    }

    @Test
    public void getErrorForInvalidApiKey() // extra field specified in response example, values of fields inconsistent with the same error for other endpoints

    {
        String apiKey = "00test00"; //to be improved as a random value
        Responses.validate401DeleteRatingErrorResponse(Requests.deleteRequest(String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, apiKey)));
    }

    @Test
    public void getErrorForEmptyApiKey() // extra field specified in response example, values of fields inconsistent with the same error for other endpoints

    {
        String apiKey = "";
        Responses.validate401DeleteRatingErrorResponse(Requests.deleteRequest(String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, apiKey)));
    }

    @Test
    public void getErrorForInvalidMovieId() // not specified for this endpoint


    {
        String movieId = "00test00"; //to be improved as a random value
        Responses.validateStatusResponseNoDetails(Requests.deleteRequest(String.format(Constants.Endpoints.RATING, movieId, Constants.Stubs.API_KEY)), 404);
    }

    @Test
    public void getErrorForEmptyMovieId() // not specified for this endpoint

    {
        String movieId = "";
        Responses.validateStatusResponseNoDetails(Requests.deleteRequest(String.format(Constants.Endpoints.RATING, movieId, Constants.Stubs.API_KEY)), 404);
    }


}
