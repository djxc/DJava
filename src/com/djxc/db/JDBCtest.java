package com.djxc.db;

/**
 *
 */
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.sql.*;

public class JDBCtest
{
    public static void main(String[] args){
        JDBCtest test = new JDBCtest();
        test.getProperties();
    }

    public Connection getProperties(){
        Connection conn = null;
        try{
            Properties pros = new Properties();
            InputStream in = Files.newInputStream(Paths.get("mysql.properties"));
            pros.load(in);
            String drivers = pros.getProperty("drivers");
            if (drivers!= null) System.setProperty("jdbc.drivers", drivers);
            String url = pros.getProperty("url");
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");

            System.out.println(drivers + ":" + url + ":" + user+ ":" + password);
            conn = DriverManager.getConnection(url, user, password);

        }catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }

}
