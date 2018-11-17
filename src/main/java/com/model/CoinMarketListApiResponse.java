
package com.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CoinMarketListApiResponse extends ApiResponse<Map<String, CoinMarket>> {

    // Constructs the response model.
    @JsonCreator
    public CoinMarketListApiResponse(@JsonProperty(JSON_DATA_PROPERTY) Map<String, CoinMarket> data,
            @JsonProperty(JSON_METADATA_PROPERTY) Map<String, Object> metadata) {
        super(data, metadata);
    }
}
