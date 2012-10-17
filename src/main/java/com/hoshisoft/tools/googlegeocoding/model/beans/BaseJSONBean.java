package com.hoshisoft.tools.googlegeocoding.model.beans;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class BaseJSONBean implements Serializable {
    public static final Logger log = Logger.getLogger(BaseJSONBean.class);

    private static final long serialVersionUID = 1L;
    
    @JsonAnySetter
    public void handleUnknown(String key, Object value) {
        StringBuilder message = new StringBuilder();
        
        message.append("Unknown JSON property: '").append(key);
        message.append("' value: '").append(value).append("'");
        
        log.debug(message.toString());
    }
}
