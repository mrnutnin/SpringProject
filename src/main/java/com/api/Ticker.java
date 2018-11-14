package com.api;

import com.model.ApiResponse;


public interface Ticker<T extends ApiResponse<?>, E> {

    /**
     * Obtain a response from the ticker implementation.
     *
     * @return a full api response containing our requested information.
     */
    T getApiResponse();

    /**
     * Obtain a usable model from the ticker implementation.
     *
     * @return a valid response containing our requested information.
     */
    E get();

}
