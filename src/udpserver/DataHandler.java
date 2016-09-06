/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;

import java.util.ArrayList;

/**
 *
 * @author Eivind
 */
public class DataHandler {
    
    private ArrayList<Boolean> dataList;
    
    private boolean fwd, rev, right, left, attack;
    
    public DataHandler()
    {
        dataList = new ArrayList<>();
        
        fwd = false;
        rev = false;
        right = false;
        left = false;
        attack = false;
        
        for(int i = 0; i <= 4; i++)
        {
            dataList.add(false);
        }
    }
    
    public void checkData(ArrayList<Boolean> list)
    {
        if(list != dataList)
        {
            if(list.get(0) != fwd)
            {
                fwd = list.get(0);
                runFWD(list.get(0));
            }
            if(list.get(1) != left)
            {
                left = list.get(1);
                runLEFT(list.get(1));
            }
            if(list.get(2) != rev)
            {
                rev = list.get(2);
                runREV(list.get(2));
            }
            if(list.get(3) != right)
            {
                right = list.get(3);
                runRIGHT(list.get(3));
            }
            if(list.get(4) != attack)
            {
                attack = list.get(4);
                attack(list.get(4));
            }
            
            dataList = list;
        }
    }
    
    private void runFWD(boolean fwd)
    {
        if(fwd)
            System.out.println("Running forward");
        else
            System.out.println("Not forward");
    }
    
    private void runREV(boolean rev)
    {
        if(rev)
            System.out.println("Running reverse");
        else
            System.out.println("Not reverse");
    }
    
    private void runRIGHT(boolean right)
    {
        if(right)
            System.out.println("Running right");
        else
            System.out.println("Not right");
    }
    
    private void runLEFT(boolean left)
    {
        if(left)
            System.out.println("Running left");
        else
            System.out.println("Not left");
    }
    
    private void attack(boolean attack)
    {
        if(attack)
            System.out.println("Attacking!!!");
        else
            System.out.println("Not attacking");
    }
}
