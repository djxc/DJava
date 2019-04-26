package com.djxc.web;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.w3c.dom.CharacterData;

public class ParseXML
{
    private Element root;

    public ParseXML(File file){
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);        
            root = doc.getDocumentElement();           
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void showAllNodes(){
        listNodes(root);
    }
    
    /**
     * 迭代遍历每个节点，并输出每个节点的标签与值
     */
    public void listNodes(Element e){
        int num = getChildCount(e);
        if(num > 0){
           System.out.println("***************************" + e.getTagName() 
                + "(childnum:" + num + ")***************************");
           NodeList children = e.getChildNodes();
            for (int i = 0; i<children.getLength(); i++)
            {
                Node n = children.item(i);
                if (n instanceof Element)
                {
                    Element child = (Element) n;
                    listNodes(child);
                }
            }
        }else{
            Text textNode = (Text)e.getFirstChild();
            String text = textNode.getData().trim();
            System.out.println(e.getTagName() + "--" + text);                    
        }
    }

    /**
     * 计算子节点个数
     */
    public int getChildCount(Element e){
        int num = 0;
        NodeList children = e.getChildNodes();
        for (int i = 0; i<children.getLength(); i++)
        {
            Node n = children.item(i);
            if (n instanceof Element)
            {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args)
    {
       File file = new File("data/test.xml");
       ParseXML parseXml = new ParseXML(file);     
       parseXml.showAllNodes();
    }

}
