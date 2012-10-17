package com.hoshisoft.tools.googlegeocoding.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Model: https://developers.google.com/maps/documentation/geocoding/#StatusCodes
 * @author Luka Obradovic, 2012
 *
 */
public enum Status {
    OK, ZERO_RESULTS, OVER_QUERY_LIMIT, REQUEST_DENIED, INVALID_REQUEST;
    
    @JsonValue
    public String value() {
        return name();
    }

    @JsonCreator
    public static Status fromValue(String v) {
        return valueOf(v);
    }
}
