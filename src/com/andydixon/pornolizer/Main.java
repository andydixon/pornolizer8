package com.andydixon.pornolizer;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
//        try {
//            BaseHttpServer.initialise(8500);
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
        Pornolizer porno = new Pornolizer("en");
        System.out.println("Here");
        System.out.println(porno.pornolizeURL("https://www.bbc.co.uk/news/uk-56218952"));
    }
}