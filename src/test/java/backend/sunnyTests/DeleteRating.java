package backend.sunnyTests;

import config.Constants;
import helpers.backend.PostRequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

public class DeleteRating {

    @Test
    public void deleteRating ()

    {
        Responses.validateDeleteRatingResponse(Requests.deleteRequest(String.format(Constants.Endpoints.RATING, Constants.Stubs.MOVIE_ID, Constants.Stubs.API_KEY)));
    }
}
