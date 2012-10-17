package com.hoshisoft.tools.googlegeocoding.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hoshisoft.tools.googlegeocoding.model.enums.LocationType;

public class GeometryBean extends BaseJSONBean {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("location")
    private LatLongBean location;
    
    @JsonProperty("location_type")
    private LocationType locationType;
    
    @JsonProperty("viewport")
    private ViewportBean viewport;
    
    @JsonProperty("bounds")
    private BoundsBean bounds;

    public LatLongBean getLocation() {
        return location;
    }

    public void setLocation(LatLongBean location) {
        this.location = location;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public ViewportBean getViewport() {
        return viewport;
    }

    public void setViewport(ViewportBean viewport) {
        this.viewport = viewport;
    }

    public BoundsBean getBounds() {
        return bounds;
    }

    public void setBounds(BoundsBean bounds) {
        this.bounds = bounds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bounds == null) ? 0 : bounds.hashCode());
        result =
                prime * result + ((location == null) ? 0 : location.hashCode());
        result =
                prime
                        * result
                        + ((locationType == null) ? 0 : locationType.hashCode());
        result =
                prime * result + ((viewport == null) ? 0 : viewport.hashCode());
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
        
        if (!(obj instanceof GeometryBean)) {
            return false;
        }
        
        GeometryBean other = (GeometryBean) obj;
        if (bounds == null) {
            if (other.bounds != null) {
                return false;
            }
        } else if (!bounds.equals(other.bounds)) {
            return false;
        }
        
        if (location == null) {
            if (other.location != null) {
                return false;
            }
        } else if (!location.equals(other.location)) {
            return false;
        }
        
        if (locationType != other.locationType) {
            return false;
        }
        
        if (viewport == null) {
            if (other.viewport != null) {
                return false;
            }
        } else if (!viewport.equals(other.viewport)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("GeometryBean [location=");
        builder.append(location);
        builder.append(", locationType=");
        builder.append(locationType);
        builder.append(", viewport=");
        builder.append(viewport);
        builder.append(", bounds=");
        builder.append(bounds);
        builder.append("]");
     
        return builder.toString();
    }
}
