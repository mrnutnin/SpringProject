package com.api;

import com.model.ApiResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ApiConnector {

    // API version that is supported.
    public static final String API_VERSION = "v2";

    // Base URL for API endpoints.
    public static final String API_BASE_URL = "https://api.coinmarketcap.com/";
    private Client client;
    private WebTarget webTarget;

    public ApiConnector() {
        client = ClientBuilder.newClient();
        webTarget = client.target(API_BASE_URL + API_VERSION + "/");
    }

    public ApiConnector path(String path) {
        webTarget = webTarget.path(path);
        return this;
    }

    public ApiConnector queryParam(String key, Object value) {
        webTarget = webTarget.queryParam(key, String.valueOf(value));
        return this;
    }

    private Invocation.Builder prepareRequest() {
        return webTarget.request(MediaType.APPLICATION_JSON);
    }

    public <T> T get(Class<T> clazz) {
        return prepareRequest().get(clazz);
    }

    // Get API response
    public <T extends ApiResponse<?>> T getApiResponse(Class<T> clazz) {
        return prepareRequest().get(clazz);
    }

}
