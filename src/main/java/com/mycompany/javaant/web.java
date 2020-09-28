/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaant;

import com.sun.istack.internal.logging.Logger;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

/**
 *
 * @author user
 */
public class web {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ServerSocket server=new ServerSocket(5080);
            while(true){
                Socket client = server.accept();
                OutputStream outputStream = client.getOutputStream();
                OutputStreamWriter writer = new OutputStreamWriter(outputStream,"utf-8");
                writer.write("HTTP/1.0 200 OK\r\n\r\n");
                writer.write("<body style='background-color:BLUE'><h1>suprise mother fucxer</h1></body>");
                writer.flush();
                writer.close();
            }
        }catch(IOException ex){
           
        }
    }
    
}
