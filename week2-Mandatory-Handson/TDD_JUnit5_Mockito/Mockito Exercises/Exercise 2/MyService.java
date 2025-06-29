package Week2_Mockito_Exercise2;

public class MyService {
	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData(); // method to be verified
    }
}
