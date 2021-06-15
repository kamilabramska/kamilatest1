package helpers.backend;

import io.restassured.response.Response;
import org.testng.Assert;

public class Responses {

    public static void validateLatestResponse(Response response)
    {
        response.then().log().all();
        response.then().statusCode(200).extract().as(LatestResponseBody.class);
    }

    public static void validateNowPlayingResponse(Response response, Integer page)
    {
        response.then().log().all();
        NowPlayingResponseBody responseBody = response.then().statusCode(200).extract().as(NowPlayingResponseBody.class);
        Assert.assertEquals(page, responseBody.getPage());
    }

    public static void validatePopularResponse(Response response, Integer page)
    {
        response.then().log().all();
        PopularResponseBody responseBody = response.then().statusCode(200).extract().as(PopularResponseBody.class);
        Assert.assertEquals(page, responseBody.getPage());
    }

    public static void validateRateMovieResponse(Response response)
    {
        validateStatusResponse(response, 201, "Success.", 1);

    }

    public static void validateDeleteRatingResponse(Response response)
    {
        validateStatusResponse(response, 200, "The item/record was deleted successfully.", 13);

    }

    public static void validate401ErrorResponse(Response response)
    {
        validateStatusResponse(response, 401, "Invalid API key: You must be granted a valid key.", 7);

    }

    public static void validate404ErrorResponse(Response response)
    {
        validateStatusResponse(response, 404, "The resource you requested could not be found.", 34);

    }

    public static void validate401DeleteRatingErrorResponse(Response response)
    {
        validateStatusResponse(response, 401, "Authentication failed: You do not have permissions to access the service.", 3);

    }


    public static void validateStatusResponse(Response response, Integer code, String message, Integer statusCode)
    {
        response.then().log().all();
        Status status = response.then().statusCode(code).extract().as(Status.class);
        Assert.assertEquals(message, status.getStatusMessage());
        Assert.assertEquals(statusCode, status.getStatusCode());
    }

    public static void validateStatusResponseNoDetails(Response response, Integer code)
    {
        response.then().log().all();
        response.then().statusCode(code).extract().as(Status.class);
    }

}
