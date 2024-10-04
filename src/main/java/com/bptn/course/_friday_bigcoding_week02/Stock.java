package com.bptn.course._friday_bigcoding_week02;

public class Stock {
    // Variables
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0.0;
        this.marketCap = calculateMarketCap();
    }

    // Method to calculate market capitalization
    private long calculateMarketCap() {
        return (long) this.totalShares * this.price;
    }

    // Method to adjust price
    public void adjustPrice(int change) {
        int originalPrice = this.price;
        this.price = change + price;
        this.percentChange = ((double) (change) / this.price) * 100;
        this.marketCap = calculateMarketCap();
    }

    // toString method to return stock information
    @Override
    public String toString() {
        return "Ticker Symbol: " + this.tickerSymbol + "\n" +
                "Company: " + this.companyName + "\n" +
                "Current Price: $" + this.price + " (" + this.percentChange + "%)\n" +
                "Market Cap: $" + this.marketCap;
    }

    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}

