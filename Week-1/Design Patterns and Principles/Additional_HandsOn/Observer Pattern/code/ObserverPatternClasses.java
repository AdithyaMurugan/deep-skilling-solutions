package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

interface Observer {
    void update(String stockName, double price);
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public void setStock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(stockName, stockPrice);
        }
    }
}

class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    public void update(String stockName, double price) {
        System.out.println("MobileApp - " + user + ": " + stockName + " updated to ₹" + price);
    }
}

class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    public void update(String stockName, double price) {
        System.out.println("WebApp - " + user + ": " + stockName + " updated to ₹" + price);
    }
    }