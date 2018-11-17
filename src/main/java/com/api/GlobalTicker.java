package com.api;

import com.model.Currency;
import com.model.CoinMarketList;
import com.model.CoinMarketListApiResponse;

public class GlobalTicker implements Ticker<CoinMarketListApiResponse, CoinMarketList> {

    private ApiConnector apiConnector;

    public GlobalTicker() {
        apiConnector = new ApiConnector().path("/ticker");
    }

    public GlobalTicker setLimit(int limit) {
        apiConnector = apiConnector.queryParam("limit", limit);
        return this;
    }

    public GlobalTicker convert(Currency currency) {
        apiConnector = apiConnector.queryParam("convert", currency.name());
        return this;
    }

    @Override
    public CoinMarketListApiResponse getApiResponse() {
        return apiConnector.getApiResponse(CoinMarketListApiResponse.class);
    }

    @Override
    public CoinMarketList get() {
        return new CoinMarketList(getApiResponse().getData().values());
    }

}
