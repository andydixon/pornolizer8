package com.andydixon;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpPrincipal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaseHttpServer{
    public static void initialise(int port) throws IOException {
        com.sun.net.httpserver.HttpServer server = com.sun.net.httpserver.HttpServer.create(new InetSocketAddress(port), 0);
        HttpContext homepageContext = server.createContext("/");
        homepageContext.setHandler(BaseHttpServer::handleHomepage);
        HttpContext pornolize = server.createContext("/pornolize");
        pornolize.setHandler(BaseHttpServer::handleTranslator);
        HttpContext context = server.createContext("/debuggery");
        context.setHandler(BaseHttpServer::handleRequest);
        server.start();
    }
    private static void handleHomepage(HttpExchange exchange) throws IOException {
        URI requestURI = exchange.getRequestURI();
        String response = PornolizerAssets.homePage;
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
    private static void handleTranslator(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        Pornolizer porno = new Pornolizer("en");
        Map<String, Object> parameters = new HashMap<String, Object>();
        System.out.println("Method is ["+method+"]");
        if(method.equals("GET")) {
            System.out.println("here");
            URI requestedUri = exchange.getRequestURI();
            System.out.println("1");

            String query = requestedUri.getRawQuery();
            System.out.println("2");

            URLTools.parseQuery(query, parameters);
            System.out.println("3");
        } else {
            System.out.println("Hit POST");
            InputStreamReader isr = new InputStreamReader(exchange.getRequestBody(), "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String query = br.readLine();
            URLTools.parseQuery(query, parameters);
        }

        // DEBUG
        for (String key : parameters.keySet())
            System.out.println(key + " = " + parameters.get(key));

        String response = porno.pornolizeURL((String) parameters.get("url")).toString();
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
    private static void handleRequest(HttpExchange exchange) throws IOException {
        URI requestURI = exchange.getRequestURI();
        printRequestInfo(exchange);
        String response = "This is the response at " + requestURI;
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private static void printRequestInfo(HttpExchange exchange) {
        System.out.println("-- headers --");
        Headers requestHeaders = exchange.getRequestHeaders();
        requestHeaders.entrySet().forEach(System.out::println);

        System.out.println("-- principle --");
        HttpPrincipal principal = exchange.getPrincipal();
        System.out.println(principal);

        System.out.println("-- HTTP method --");
        String requestMethod = exchange.getRequestMethod();
        System.out.println(requestMethod);

        System.out.println("-- query --");
        URI requestURI = exchange.getRequestURI();
        String query = requestURI.getQuery();
        System.out.println(query);
    }
}