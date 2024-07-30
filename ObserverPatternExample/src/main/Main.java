package main;

import subject.StockMarket;
import observer.MobileApp;
import observer.WebApp;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        MobileApp mobileApp = new MobileApp("MobileApp1");
        WebApp webApp = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.00);  // Notify all registered observers
        stockMarket.setStockPrice(105.50);  // Notify all registered observers

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(110.75);  // Notify remaining registered observers
    }
}
