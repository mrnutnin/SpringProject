package com.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Map;

//@XmlRootElement Associates a global element with the schema type to which the class is mapped.Default  Settings
@XmlRootElement
public final class CoinMarket {

    private final long id;
    private final String name;
    private final String symbol;
    private final int rank;
    private final String websiteSlug;
    private final double circulatingSupply;
    private final double totalSupply;
    private final double maxSupply;
    private final Map<Currency, PriceQuote> priceQuotes;
    private final long lastUpdated;

    // Constructor to instantiate a {@code CoinMarket}.
    @JsonCreator
    public CoinMarket(@JsonProperty("id") long id, @JsonProperty("name") String name,
            @JsonProperty("symbol") String symbol, @JsonProperty("website_slug") String websiteSlug,
            @JsonProperty("rank") int rank, @JsonProperty("circulating_supply") double circulatingSupply,
            @JsonProperty("total_supply") double totalSupply, @JsonProperty("max_supply") double maxSupply,
            @JsonProperty("quotes") Map<Currency, PriceQuote> priceQuotes,
            @JsonProperty("last_updated") long lastUpdated) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.websiteSlug = websiteSlug;
        this.circulatingSupply = circulatingSupply;
        this.totalSupply = totalSupply;
        this.maxSupply = maxSupply;
        this.priceQuotes = priceQuotes;
        this.lastUpdated = lastUpdated;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getRank() {
        return rank;
    }

    public String websiteSlug() {
        return websiteSlug;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public double getTotalSupply() {
        return totalSupply;
    }

    public double getMaxSupply() {
        return maxSupply;
    }

    public Map<Currency, PriceQuote> getPriceQuotes() {
        return priceQuotes;
    }

    public PriceQuote getPriceQuote(Currency currency) {
        return getPriceQuotes().get(currency);
    }

    public PriceQuote getUSDPriceQuote() {
        return getPriceQuote(Currency.USD);
    }

    public PriceQuote getTHBPriceQuote() {
        return getPriceQuote(Currency.THB);
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public Date getLastUpdatedDate() {
        return new Date(getLastUpdated());
    }
    
}
