package com.mycompany.app;

import java.net.*;
import java.io.*;

// Helper class to get an overview of active servers
public class Portscanner {
    public static void main(String[] args) {
        String host = "localhost";
        if(args.length > 0) {
            host = args[0];
        }
        
        for (int i = 1; i< 1024; i++) {
            try {
                Socket s = new Socket(host, i);
                System.out.println("Server on port: " +i+ " at " +host);
                s.close();
            } catch (UnknownHostException e) {
                System.err.println(e);
                break;
            } catch (IOException e) {
                //do nothing -> no server at port
            }
        }
    }
}
