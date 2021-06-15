package helpers.backend;

public class PostRequestBody {

    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public PostRequestBody(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PostRequestBody{" +
                "value='" + value + '\'' +
                '}';
    }
}
