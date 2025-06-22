package ObserverPattern;

public class ObserverPatternTest {
	public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer user1 = new MobileApp("Adithya");
        Observer user2 = new WebApp("Rahul");
        Observer user3 = new MobileApp("Priya");

        stockMarket.register(user1);
        stockMarket.register(user2);
        stockMarket.register(user3);

        stockMarket.setStock("TCS", 3540.50);
        System.out.println();

        stockMarket.deregister(user2);

        stockMarket.setStock("Infosys", 1480.25);
    }
}
