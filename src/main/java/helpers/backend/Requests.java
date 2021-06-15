package helpers.backend;

import config.Constants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Requests {

    public static Response postRequest(Object body, String url)
    {
        return postRequestWithContentType(body, url, ContentType.JSON);
    }

    public static Response postRequestWithContentType(Object body, String url, ContentType contentType)
    {
        return RestAssured.given().log().all().contentType(contentType).body(body).post(url);
    }

    public static Response deleteRequest(String url)
    {
        return deleteRequestWithContentType(url, ContentType.JSON);
    }

    public static Response deleteRequestWithContentType(String url, ContentType contentType)
    {
        return RestAssured.given().log().all().contentType(contentType).delete(url);
    }

    public static Response getRequest(String url)
    {
        return getRequestWithContentType(url, ContentType.JSON);
    }

    public static Response getRequestWithContentType(String url, ContentType contentType)
    {
        return RestAssured.given().log().all().contentType(contentType).get(url);
    }
}
