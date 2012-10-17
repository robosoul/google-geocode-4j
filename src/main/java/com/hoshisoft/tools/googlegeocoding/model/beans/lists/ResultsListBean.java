package com.hoshisoft.tools.googlegeocoding.model.beans.lists;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hoshisoft.tools.googlegeocoding.model.beans.BaseJSONBean;
import com.hoshisoft.tools.googlegeocoding.model.beans.ResultBean;
import com.hoshisoft.tools.googlegeocoding.model.enums.Status;

public class ResultsListBean extends BaseJSONBean {
    private static final long serialVersionUID = 1L;

    @JsonProperty("results")
    public List<ResultBean> results;
    
    @JsonProperty("status")
    public Status status;

    public List<ResultBean> getResults() {
        return results;
    }

    public void setResults(List<ResultBean> results) {
        this.results = results;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("ResultsListBean [results=");
        builder.append(results);
        builder.append(", status=");
        builder.append(status);
        builder.append("]");
      
        return builder.toString();
    }
}
