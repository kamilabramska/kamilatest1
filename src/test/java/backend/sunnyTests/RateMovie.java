package backend.sunnyTests;

import config.Constants;
import helpers.backend.PostRequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

public class RateMovie {

    @Test
    public void rateMovie()

    {
        Double value = 6.0; //to be improved as a random value
        Responses.validateRateMovieResponse(Requests.postRequest(new PostRequestBody(value), String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, Constants.Stubs.API_KEY)));
    }
}
