package com.andydixon;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Pornolizer {

    PornolizerDictionary dictionary;
    Random rng;

    /**
     * Instantiate the Pornolizer engine
     * @param language en, normally
     */
    public Pornolizer(String language) {
        this.dictionary = new PornolizerDictionary(language);
        this.rng = new Random();
    }

    /**
     * Pornolize a string based on the langauge when initialised
     * @param origText
     * @param sweariness
     * @return String
     */
    public String pornolize(String origText, int sweariness) {
        return proseConverter(nameConverter(origText, sweariness), sweariness);
    }

    public Document pornolizeURL(String url, String method, Map<String, String> postVars) {
        PornolizerDocument doc;
        String returnContent = "";
        if (method=="") method="GET";

        try {
            if(method=="POST") {
                doc = PornolizerTransport.retrieveURL(url,postVars);
            } else {
                doc = PornolizerTransport.retrieveURL(url);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return Jsoup.parse(GuruMeditation.generate(e.getMessage())) ;
        }

        Document page = doc.page;
        System.out.println(doc.resultUrl.toString());
        /**
        Grab elements to pornolize
         */
        String[] elements = new String[]{"h1","h2","h3","h4","h5","h6","p"};
        for (String elementSelector: elements) {
            Elements elem = page.select(elementSelector);

            for (Element src : elem) {
                src.html(pornolize(src.html(),70));
            }

        }

        /**
         * Rewrite URLs and add additional nuggets of love
         */


        Elements elem = page.select("a");

        for (Element src : elem) {
            String srcurl= src.attr("href");
            if (srcurl.startsWith("/") && !srcurl.startsWith("//")) {
                src.attr("href", URLTools.getScheme(doc.resultUrl)+"://"+URLTools.getHostName(doc.resultUrl)+srcurl);
            }
            //$c2->attr('href', $this->selfHost . '/pornolize?lang=' . $lang . '&url=' . $c2->attr('href'));
            String refurl = src.attr("href");
            try {
                src.attr("href", "http://www.pornolize.com/pornolize/?lang="+dictionary.language+"&url="+ URLEncoder.encode(refurl, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        elem = page.select("img");

        for (Element src : elem) {
            String srcurl= src.attr("src");
            if (srcurl.startsWith("/") && !srcurl.startsWith("//")) {
                src.attr("href", URLTools.getScheme(url)+"://"+URLTools.getHostName(url)+srcurl);
            }
        }
        elem = page.select("link");

        for (Element src : elem) {
            String srcurl= src.attr("rel");
            if (srcurl.startsWith("/") && !srcurl.startsWith("//")) {
                src.attr("rel", URLTools.getScheme(url)+"://"+URLTools.getHostName(url)+srcurl);
            }
        }

        elem = page.select("script");

        for (Element src : elem) {
            String srcurl= src.attr("src");
            if (srcurl.startsWith("/") && !srcurl.startsWith("//")) {
                src.attr("href", URLTools.getScheme(url)+"://"+URLTools.getHostName(url)+srcurl);
            }
        }

        page.select("head").prepend("<base href='" + URLTools.getScheme(doc.resultUrl) + "://" + URLTools.getHostName(doc.resultUrl) + "' ></base>");
        page.select("head").append("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-76162478-4\"></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', 'UA-76162478-4');</script>");
        page.select("head").prepend("\n\n<!-- Converted by The Pornoliser (c)2021 Andy Dixon - pornolize.com / andydixon.com -->\n\n");


        return page;
    }

    public Document pornolizeURL(String url) {
        Map<String, String> postVars = new HashMap<String, String>();
        return pornolizeURL(url, "GET", postVars);
    }

    /**
     * Pornolize names within a string
     * @param text
     * @param sweariness
     * @return String
     */
    private String nameConverter(String text, int sweariness) {

        int match = 0;
        String returnText = "";
        String[] words = text.split(" ");

        for (String word : words) {
            if (word == ucfirst(word)) {
                match = match + 1;
            } else {
                match = 0;
            }

            if (match == 2) {
                if (this.rng.nextInt(100) + 1 <= sweariness) {
                    returnText = returnText + " \"" + dictionary.randomName() + "\"";
                }
                match = 0;
            }
            returnText = returnText + " " + word;
        }

        return returnText;
    }

    /**
     * Pornolize prose within the supplied text
     * @param text
     * @param sweariness
     * @return String - pornolized prose
     */
    private String proseConverter(String text, int sweariness) {

        String returnText = "";
        String[] words = text.split(" ");
        String suffix = "";

        for (String word : words) {
            if (word.endsWith("ing") || word.endsWith("ed") || word.endsWith("s")) {

                if (this.rng.nextInt(100) + 1 <= sweariness) {

                    if (word.endsWith("ing")) {
                        suffix = "ing";
                    }
                    if (word.endsWith("ed")) {
                        suffix = "ed";
                    }
                    if (word.endsWith("s")) {
                        suffix = "s";
                    }

                    word = dictionary.randomAdjective() + suffix;
                    suffix = "";
                }
            }
            returnText = returnText + " " + word;
        }
        return returnText;
    }

    final public static String ucfirst(String subject) {
        if (subject.length()>0) {
            return Character.toUpperCase(subject.charAt(0)) + subject.substring(1);
        } else {
            return subject;
        }
    }
}
