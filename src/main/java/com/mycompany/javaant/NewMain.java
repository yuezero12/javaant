/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaant;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=1024;i++){
            try{
                Socket s =new Socket("localhost",i);
                System.out.println("service on port"+i);}
            catch(IOException ex){}
        }
    }
    
}
