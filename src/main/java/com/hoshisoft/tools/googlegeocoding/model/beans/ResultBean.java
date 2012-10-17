package com.hoshisoft.tools.googlegeocoding.model.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hoshisoft.tools.googlegeocoding.model.beans.AddressComponentBean;
import com.hoshisoft.tools.googlegeocoding.model.beans.BaseJSONBean;
import com.hoshisoft.tools.googlegeocoding.model.beans.GeometryBean;
import com.hoshisoft.tools.googlegeocoding.model.enums.Type;

public class ResultBean extends BaseJSONBean {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("address_components")
    private List<AddressComponentBean> addressComponents;
    
    @JsonProperty("formatted_address")
    private String formatedAddress;
    
    @JsonProperty("geometry")
    private GeometryBean geometry;
    
    @JsonProperty("types")
    private List<Type> types;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
       
        builder.append("ResultBean [addressComponents=");
        builder.append(addressComponents);
        builder.append(", formatedAddress=");
        builder.append(formatedAddress);
        builder.append(", geometry=");
        builder.append(geometry);
        builder.append(", types=");
        builder.append(types);
        builder.append("]");
        
        return builder.toString();
    }
}
