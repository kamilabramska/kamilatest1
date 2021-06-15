package backend.sunnyTests;

import config.Constants;
import helpers.backend.PostRequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

public class GetLatest {

    @Test
    public void getLatest()

    {

        Responses.validateLatestResponse(Requests.getRequest(String.format(Constants.Endpoints.LATEST, Constants.Stubs.API_KEY)));
    }
}
