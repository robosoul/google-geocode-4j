package com.hoshisoft.tools.googlegeocoding.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LocationType {
    ROOFTOP, RANGE_INTERPOLATED, GEOMETRIC_CENTER, APPROXIMATE;
    
    @JsonValue
    public String value() {
        return name();
    }

    @JsonCreator
    public static LocationType fromValue(String v) {
        return valueOf(v);
    }
}
