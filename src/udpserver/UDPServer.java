/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 *
 * @author Eivind
 */
public class UDPServer {
    
    /*
    fwd = 0
    left = 1
    rev = 2
    right = 3
    attack = 4
    */
    
    private DatagramSocket serverSocket;
    private final int serverPort = 9876;
    private ByteArrayInputStream baos;
    private ObjectInputStream ois;
    
    private ArrayList<Boolean> list;
    private DataHandler data;
    
    public UDPServer () throws Exception
    {
        data = new DataHandler();
        this.run();
    }
    
    private void run() throws Exception
    {
        serverSocket = new DatagramSocket(serverPort);
        
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        
        while(true)
        {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            
            baos = new ByteArrayInputStream(receiveData);
            ois = new ObjectInputStream(baos);
            
            list = (ArrayList<Boolean>) ois.readObject(); 
            
            data.checkData(list);
        }
    }
}
