package com.mycompany.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); 
        while (true) {
            String theLine = userInput.readLine(); //get input from user
            if (theLine.equals(".")) { //to stop the client
                break;
            }
            try (Socket s = new Socket("localhost", 7)) { //Create new connection to server at hostname: localhost and port: 7
                BufferedReader networkIn = new BufferedReader(new InputStreamReader(s.getInputStream())); //get BufferedReader instance to read responses
                PrintWriter networkOut = new PrintWriter(s.getOutputStream()); //get PrintWriter instance to send requests
                networkOut.println(theLine); //append the input to the request
                networkOut.flush(); //send the request to the server
                System.out.println(networkIn.readLine()); //read the response and print it to the console
            }
        }
    }
}
