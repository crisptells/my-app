package com.mycompany.app;

import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            ServerSocket server = new ServerSocket(7); //open server at port 7
            while (true) {
                try (Socket connection = server.accept()){ //accept any new connection
                    //Here is defined what the server should do
                    in = new BufferedReader(new InputStreamReader(connection.getInputStream())); //The request gets saved
                    PrintWriter out = new PrintWriter(connection.getOutputStream()); //The response object gets prepared
                    String line = in.readLine();
                    if (line.equals("stop!")) { //If the request is stop! the server stops
                        System.out.println("Server STOP!");
                        out.println("Bye Bye");
                        out.flush();
                        server.close();
                        break;
                    } 
                    
                    out.println(line); //the value of in gets appended to the response
                    out.flush(); //the reponse gets send
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
