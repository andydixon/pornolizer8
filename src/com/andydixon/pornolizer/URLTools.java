package com.andydixon.pornolizer;

import java.net.URI;
import java.net.URISyntaxException;

public class URLTools {


    public static String getHostName(String url) {
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri.getHost();
    }

    public static String getScheme(String url) {
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri.getScheme();
    }

}
