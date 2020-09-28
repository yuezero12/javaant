/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaant;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TimeServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ServerSocket server = new ServerSocket(13);
            System.out.println("connection opened");
            while(true){
                Socket client = server.accept();
                OutputStream outputStream = client.getOutputStream();
                OutputStreamWriter writer = new OutputStreamWriter(outputStream,"ascii");
                Date date = new Date();
                writer.write(date.toString());
                writer.flush();
                client.close();
            }
        }catch(IOException ex){
            Logger.getLogger(TimeServer.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
}
