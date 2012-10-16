package com.hoshisoft.tools.googlegeocoding.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoundsBean extends BaseBean {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("northeast")
    private LatLongBean northEast;
    
    @JsonProperty("southwest")
    private LatLongBean southWest;

    public LatLongBean getNorthEast() {
        return northEast;
    }

    public void setNorthEast(LatLongBean northEast) {
        this.northEast = northEast;
    }

    public LatLongBean getSouthWest() {
        return southWest;
    }

    public void setSouthWest(LatLongBean southWest) {
        this.southWest = southWest;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        
        result =
                prime * result
                        + ((northEast == null) ? 0 : northEast.hashCode());
        
        result =
                prime * result
                        + ((southWest == null) ? 0 : southWest.hashCode());
        
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
        
        if (!(obj instanceof BoundsBean)) {
            return false;
        }
        
        BoundsBean other = (BoundsBean) obj;
        if (northEast == null) {
            if (other.northEast != null) {
                return false;
            }
        } else if (!northEast.equals(other.northEast)) {
            return false;
        }
        
        if (southWest == null) {
            if (other.southWest != null) {
                return false;
            }
        } else if (!southWest.equals(other.southWest)) {
            return false;
        }
     
        return true;
    }
}
