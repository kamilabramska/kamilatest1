package backend.rainyTests;

import config.Constants;
import helpers.backend.PostRequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

public class GetLatest {

    @Test
    public void getErrorForInvalidApiKey() // extra field specified in response example

    {
        String apiKey = "00test00"; //to be improved as a random value
        Responses.validate401ErrorResponse(Requests.getRequest(String.format(Constants.Endpoints.LATEST, apiKey)));
    }

    @Test
    public void getErrorForEmptyApiKey() // extra field specified in response example

    {
        String apiKey = "";
        Responses.validate401ErrorResponse(Requests.getRequest(String.format(Constants.Endpoints.LATEST, apiKey)));
    }

    // not specified how to get 404 error as we don't request a single resource
}
