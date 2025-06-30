package mockito_Exercise_7;

public class MyService {
	 private ExternalApi api;

	    public MyService(ExternalApi api) {
	        this.api = api;
	    }

	    public void performRiskyAction() {
	        api.riskyAction();
	    }
}
