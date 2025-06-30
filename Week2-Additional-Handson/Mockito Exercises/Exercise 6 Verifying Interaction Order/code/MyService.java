package mockito_Exercise_6;

public class MyService {
	 private ExternalApi api;

	    public MyService(ExternalApi api) {
	        this.api = api;
	    }

	    public void run() {
	        api.initialize();
	        api.fetchData();
	        api.close();
	    }
}
