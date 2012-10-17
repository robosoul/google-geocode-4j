package com.hoshisoft.tools.googlegeocoding.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Model: https://developers.google.com/maps/documentation/geocoding/#Types
 * 
 * @author Luka Obradovic, 2012
 *
 */
public enum Type {
    STREET_ADDRESS("street_address"),
    ROUTE("route"),
    INTERSECTION("intersection"),
    POLITICAL("political"),
    COUNTRY("country"),
    ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
    ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
    ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
    COLLOQUIAL_AREA("colloquial_area"),
    LOCALITY("locality"),
    SUBLOCALITY("sublocality"),
    NEIGHBORHOOD("neighborhood"),
    PREMISE("premise"),
    SUBPREMISE("subpremise"),
    POSTAL_CODE("postal_code"),
    NATURAL_FEATURE("natural_feature"),
    AIRPORT("airport"),
    PARK("park"),
    POINT_OF_INTEREST("point_of_interest"),
    POST_BOX("post_box"),
    STREET_NUMBER("street_number"),
    FLOOR("floor"),
    ROOM("room");

    private final String value;

    private Type(final String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static Type fromValue(final String v) {
        for (Type t : Type.values()) {
            if (t.value.equals(v)) {
                return t;
            }
        }
        
        throw new IllegalArgumentException(v);
    }
}
