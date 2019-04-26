package com.djxc.web;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * @version 1.0
 * @author dj
 * 
 */

public class SocketTest
{
    public static void main(String[] args) throws IOException
    {
        try (Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13))
        {
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);

            while (in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }                
         }

        InetAddress address = InetAddress.getByName("time-A.timefreq.bldrdoc.gov");
        System.out.println(address);
        //createServer();
        mutilCline();
    }

    public static void createServer() throws IOException
    {
        ServerSocket s = new ServerSocket(8189);
        Socket incoming = s.accept();
        Response(incoming);
    }


    public static void Response(Socket incoming)
    {
        try
        {
            try
            {
                InputStream inStream = incoming.getInputStream();             
                OutputStream outStream = incoming.getOutputStream();
                Scanner in = new Scanner(inStream);
           
                PrintWriter out = new PrintWriter(outStream, true);
                out.println("hello! Enter BYE to exit.");
                boolean done = false;
                while(!done && in.hasNextLine())
                {
                    String line = in.nextLine();
                    out.println("Echo: " + line);
                    if (line.trim().equals("BYE")) 
                        done = true;
                }
            }
            finally{
                incoming.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    
    /**
     * 多个客户端的连接，每一个客户端开启一个线程
     */
    public static void mutilCline()
    {
        try
        {
            int i =1;
            ServerSocket server = new ServerSocket(8189);
            while(true)
            {
                Socket incoming = server.accept();
                System.out.println("Spawning " + i);
                Thread t = new Thread(new Runnable(){
                    public void run(){ Response(incoming);}
                });
                t.start();
                i++;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}

