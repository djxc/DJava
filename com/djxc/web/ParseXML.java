package cim.djxc.web;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.w3c.dom.CharacterData;

public class ParseXML
{
    public static void main(String[] args)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse();
    }
}
