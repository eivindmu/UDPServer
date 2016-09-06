/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eivind
 */
public class Start {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            UDPServer server = new UDPServer();
        } catch (Exception ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
