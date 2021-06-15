package helpers.backend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class NowPlayingResponseBody {

    private Integer page;
    private ArrayList<Result> results;
    private Dates dates;
    @JsonProperty("total_pages")
    private Integer totalPages;
    @JsonProperty("total_results")
    private Integer totalPesults;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalPesults() {
        return totalPesults;
    }

    public void setTotalPesults(Integer totalPesults) {
        this.totalPesults = totalPesults;
    }

    @Override
    public String toString() {
        return "NowPlayingResponseBody{" +
                "page=" + page +
                ", results=" + results +
                ", dates=" + dates +
                ", totalPages=" + totalPages +
                ", totalPesults=" + totalPesults +
                '}';
    }
}
