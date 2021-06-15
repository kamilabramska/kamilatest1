package backend.sunnyTests;

import config.Constants;
import helpers.backend.PostRequestBody;
import helpers.backend.Requests;
import helpers.backend.Responses;
import org.testng.annotations.Test;

public class GetPopular {

    @Test
    public void getPopular()

    {
        Integer page = 1;
        Responses.validateLatestResponse(Requests.getRequest(String.format(Constants.Endpoints.POPULAR, Constants.Stubs.API_KEY, page)));
    }
}
