/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author Lovish
 */
public class Item {
    
    int id;
    String text;
    
    public Item(int i,String t)
    {
        id = i;
        text = t;
    }
    
    public String toString()
    {
        return text + "  " + id;
    }
    
}
