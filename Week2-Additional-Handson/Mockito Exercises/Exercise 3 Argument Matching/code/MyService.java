package Week2_Mockito_Exercise3;

public class MyService {
	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData(String param) {
        return api.getData(param);
    }
}
