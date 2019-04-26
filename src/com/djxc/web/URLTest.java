package com.djxc.web;

import java.net.*;
import java.util.*;

public class URLTest
{
    public static void main(String[] args){
        String urlName = "http://horstmann.com";
        try{
            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();
            connection.connect();
            Map<String, List<String>> header = connection.getHeaderFields();
            for(Map.Entry<String, List<String>> entry : header.entrySet()){
                String key = entry.getKey();
                for (String value : entry.getValue()){
                    System.out.println(key + " : " + value);
                }
            }
            Scanner in = new Scanner(connection.getInputStream());
            for (int i=1; in.hasNextLine() && i<11; i++){
                System.out.println(in.nextLine());
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
