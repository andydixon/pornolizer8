package com.andydixon;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.net.URI;
import java.net.URL;
import java.util.Map;

public class PornolizerDocument {

    String connectionMethod;
    Map<String, Object> parameters;
    Connection connection;
    Document page;
    URI resultUrl;
    Connection.Response rawResponse;

}
