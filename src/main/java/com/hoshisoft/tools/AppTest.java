package com.hoshisoft.tools;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hoshisoft.tools.googlegeocoding.model.beans.ResultBean;
import com.hoshisoft.tools.googlegeocoding.model.beans.lists.ResultsListBean;


public class AppTest {
    public static void main(String[] args) throws IOException {
        String address = URLEncoder.encode("1600+Amphitheatre+Parkway,+Mountain+View,+CA&sensor=true", "UTF-8");
        URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=" + address + "&sensor=true");
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
            ObjectMapper mapper = new ObjectMapper();
            
            ResultsListBean result = mapper.readValue(con.getInputStream(), ResultsListBean.class);            
            List<ResultBean> results = result.getResults();
            
            System.out.println(results.get(0).toString());
        } else {
            System.err.println(con.getResponseMessage());
        }
    }
}
