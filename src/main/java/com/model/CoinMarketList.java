package com.model;

import java.util.*;

public class CoinMarketList {

    private final List<CoinMarket> marketList;

    public CoinMarketList(Collection<CoinMarket> markets) {
        if (markets == null) {
            throw new NullPointerException("markets argument may not be null.");
        }
        this.marketList = Collections.unmodifiableList(new ArrayList<>(markets));
    }

    public CoinMarket getByName(String marketId) {
        if (marketId == null || marketId.isEmpty()) {
            return null;
        }
        return marketList.stream().filter(market -> market.getName().equalsIgnoreCase(marketId)).findFirst()
                .orElse(null);
    }

    public CoinMarket getBySymbol(String symbol) {
        if (symbol == null || symbol.isEmpty()) {
            return null;
        }
        return marketList.stream().filter(market -> market.getSymbol().equalsIgnoreCase(symbol)).findFirst()
                .orElse(null);
    }

}
