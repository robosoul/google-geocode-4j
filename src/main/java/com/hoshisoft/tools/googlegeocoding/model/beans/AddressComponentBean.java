package com.hoshisoft.tools.googlegeocoding.model.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hoshisoft.tools.googlegeocoding.model.enums.Type;

public class AddressComponentBean extends BaseJSONBean {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("types")
    private List<Type> types;
    
    @JsonProperty("long_name")
    private String longName;
    
    @JsonProperty("short_name")
    private String shortName;

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result =
                prime * result + ((longName == null) ? 0 : longName.hashCode());
        result =
                prime * result
                        + ((shortName == null) ? 0 : shortName.hashCode());
        result = prime * result + ((types == null) ? 0 : types.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (!(obj instanceof AddressComponentBean)) {
            return false;
        }
        
        AddressComponentBean other = (AddressComponentBean) obj;
        if (longName == null) {
            if (other.longName != null) {
                return false;
            }
        } else if (!longName.equals(other.longName)) {
            return false;
        }
        
        if (shortName == null) {
            if (other.shortName != null) {
                return false;
            }
        } else if (!shortName.equals(other.shortName)) {
            return false;
        }
        
        if (types == null) {
            if (other.types != null) {
                return false;
            }
        } else if (!types.equals(other.types)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("AddressComponentBean [types=");
        builder.append(types);
        builder.append(", longName=");
        builder.append(longName);
        builder.append(", shortName=");
        builder.append(shortName);
        builder.append("]");
     
        return builder.toString();
    }
}
