package com.andydixon;

import java.io.IOException;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        try {
            BaseHttpServer.initialise(8500);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
