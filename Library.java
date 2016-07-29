/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library;
import java.lang.Thread;


/**
 *
 * @author this pc
 */
public class Library {
    static String url="";
    public void dir()
    {
        try
        {
        String res=java.net.URLDecoder.decode(getClass().getResource("").toString(),"UTF-8");
        String parts[]=res.split("/");
        
        int i;
        for( i=(parts.length)-1;i>=0;i--)
        {
            //System.out.println(parts[i]+" "+i);
            if(parts[i].equals("Library"))
             break;
        }
        for(int j=1;j<=i;j++)
        {
            url=url+parts[j]+"/";
        }
        url=url+"src/com/library/";
        
        }
        catch(Exception e)
        {
            
        }
    }
    public static void main(String args[])
    {
        Library lib=new Library();
        lib.dir();
        System.out.println(url);
        
        login.main(args);
        
        
                
    }
    
}
