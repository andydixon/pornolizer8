package com.andydixon;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class PornolizerTransport {
    static PornolizerDocument retrieveURL(String url, Map<String, String> postVars) throws IOException {
        PornolizerDocument document = new PornolizerDocument();
        Connection connection = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.4 Safari/537.36")
                .data(postVars)
                .method(Connection.Method.POST);

        document.rawResponse = connection.execute();
        document.page = document.rawResponse.parse();
        document.connectionMethod = "POST";
        try {
            document.resultUrl = document.rawResponse.url().toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ;

        return document;

    }

    static PornolizerDocument retrieveURL(String url) throws IOException {
        PornolizerDocument document = new PornolizerDocument();
        Connection connection = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.4 Safari/537.36")
                .method(Connection.Method.GET);

        document.rawResponse = connection.execute();
        document.page = document.rawResponse.parse();
        document.connectionMethod = "GET";
        try {
            document.resultUrl = document.rawResponse.url().toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ;

        return document;
    }
}
