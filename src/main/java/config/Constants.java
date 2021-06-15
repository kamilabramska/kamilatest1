package config;

public interface Constants {

    interface Endpoints {
        String API_URL = "https://api.themoviedb.org/3";
        String POPULAR = API_URL + "/movie/popular?api_key=%s&language=en-US&page=%s";
        String NOW_PLAYING = API_URL + "/movie/now_playing?api_key=%s&language=en-US&page=%s";
        String LATEST = API_URL + "/movie/latest?api_key=%s&language=en-US";
        String RATING = API_URL + "/movie/%s/rating?api_key=%s";

    }

    interface Stubs {
        String API_KEY = "<<api_key>>"; // need a value
        String MOVIE_ID = "movie_id"; // need a value
    }

}
