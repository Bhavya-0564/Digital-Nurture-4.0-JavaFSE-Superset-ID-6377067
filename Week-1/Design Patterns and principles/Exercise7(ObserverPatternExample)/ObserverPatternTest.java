package ObserverPatternExample;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create the subject (StockMarket)
        StockMarket stockMarket = new StockMarket();

        // Create concrete observers
        Observer mobileApp1 = new MobileApp("StockTracker Mobile");
        Observer webApp1 = new WebApp("TradingView Web");
        Observer mobileApp2 = new MobileApp("Investing Mobile");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(webApp1);

        // Change stock price and notify observers
        stockMarket.setStockPrice(150.75);

        System.out.println("\n---\n");

        // Register another observer
        stockMarket.registerObserver(mobileApp2);

        // Change stock price again and notify observers
        stockMarket.setStockPrice(155.20);

        System.out.println("\n---\n");

        // Deregister an observer
        stockMarket.deregisterObserver(webApp1);

        // Change stock price one more time
        stockMarket.setStockPrice(152.90);
    }
} 