package com.hoshisoft.tools.googlegeocoding.model.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hoshisoft.tools.googlegeocoding.model.enums.Type;

public class ResultBean extends BaseBean {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("address_components")
    private List<AddressComponentBean> addressComponents;
    
    @JsonProperty("formatted_address")
    private String formatedAddress;
    
    @JsonProperty("geometry")
    private GeometryBean geometry;
    
    @JsonProperty("types")
    private List<Type> types;

}
