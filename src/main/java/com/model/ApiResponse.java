package com.model;

import java.util.Map;

public abstract class ApiResponse<T> {

    //HTTP Lule "error" "media type"
    public static final String JSON_DATA_PROPERTY = "data";
    public static final String JSON_METADATA_PROPERTY = "metadata";
    public static final String METADATA_ERROR_KEY = "error";
    public static final String METADATA_TIMESTAMP_KEY = "timestamp";
    protected final Map<String, Object> metadata;
    protected final T data;

    public ApiResponse(T data, Map<String, Object> metadata) {
        this.data = data;
        this.metadata = metadata;
    }

    public T getData() {
        return data;
    }
    
    /*
     * public Map<String, Object> getMetadata() { return metadata; }
     * 
     * 
     * public String getError() { return
     * String.valueOf(metadata.get(METADATA_ERROR_KEY)); }
     * 
     * 
     * public boolean hasError() { return metadata.containsKey(METADATA_ERROR_KEY)
     * && metadata.get(METADATA_ERROR_KEY) != null; }
     * 
     * 
     * public long getTimestamp() { return ((Integer)
     * metadata.get(METADATA_TIMESTAMP_KEY)).longValue(); }
     */
}
