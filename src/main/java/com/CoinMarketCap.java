package com;

//import com.api.CoinListingsFetcher;
//import com.api.CurrencyTicker;
import com.api.GlobalTicker;


public final class CoinMarketCap {

    //private static final CoinListingsFetcher COIN_LISTING_FETCHER = new CoinListingsFetcher();

    public static GlobalTicker ticker() {
        return new GlobalTicker();
    }

    /*
    public static CurrencyTicker ticker(long marketId) {
        return new CurrencyTicker(marketId);
    }

    public static CurrencyTicker ticker(String marketName) {
        return ticker(listings().get().getByName(marketName)
                .orElseThrow(() -> new NullPointerException("No market found for name " + marketName)).getId());
    }

    public static CoinListingsFetcher listings() {
        return COIN_LISTING_FETCHER;
    }
    */
}
