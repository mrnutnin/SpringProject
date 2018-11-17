package com.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceQuote {

    private final double price;
    private final double dayVolume;
    private final double marketCap;
    private final double hourChange;
    private final double dayChange;
    private final double weekChange;
    
    @JsonCreator
    public PriceQuote(@JsonProperty("price") double price,
                      @JsonProperty("volume_24h") double dayVolume,
                      @JsonProperty("market_cap") double marketCap,
                      @JsonProperty("percent_change_1h") double hourChange,
                      @JsonProperty("percent_change_24h") double dayChange,
                      @JsonProperty("percent_change_7d") double weekChange
                      ) {
        this.price = price;
        this.dayVolume = dayVolume;
        this.marketCap = marketCap;
        this.hourChange = hourChange;
        this.dayChange = dayChange;
        this.weekChange = weekChange;
   
    }

    public double getPrice() {
        return price;
    }

    public double getDayVolume() {
        return dayVolume;
    }

  
    public double getMarketCap() {
        return marketCap;
    }


    public double getHourChange() {
        return hourChange;
    }

    public double getDayChange() {
        return dayChange;
    }

    public double getWeekChange() {
        return weekChange;
    }

}
