package com.hoshisoft.tools.googlegeocoding.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LatLongBean extends BaseJSONBean {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("lat")
    private double latitude;
    
    @JsonProperty("lng")
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        
        temp = Double.doubleToLongBits(longitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        
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
        
        if (!(obj instanceof LatLongBean)) {
            return false;
        }
        
        LatLongBean other = (LatLongBean) obj;
        if (Double.doubleToLongBits(latitude) 
                != Double.doubleToLongBits(other.latitude)) {
            
            return false;
        }
        
        if (Double.doubleToLongBits(longitude) 
                != Double.doubleToLongBits(other.longitude)) {
            
            return false;
        }
     
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
       
        builder.append("LatLongBean [latitude=");
        builder.append(latitude);
        builder.append(", longitude=");
        builder.append(longitude);
        builder.append("]");
       
        return builder.toString();
    }
}
