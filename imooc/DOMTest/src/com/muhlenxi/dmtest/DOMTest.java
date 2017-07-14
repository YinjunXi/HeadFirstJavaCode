package com.muhlenxi.dmtest;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by yangxi on 2017/7/14.
 */
public class DOMTest {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            // ���� DocumentBuilder ����
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            // �����ļ�
            Document document = documentBuilder.parse("books.xml");
            // ��ȡ���� book �ڵ�ļ���
            NodeList bookList = document.getElementsByTagName("book");
            System.out.println("һ���� " + bookList.getLength() + " ����");
            // ����ÿһ�� book �ڵ�
            for (int i = 0; i < bookList.getLength();i++) {
//                Node book = bookList.item(i);
                // ��ȡ book �ڵ���������Լ���
//                NamedNodeMap attrs = book.getAttributes();
//                System.out.println("��" + (i+1) + "����" + "����" + attrs.getLength() + "������");
//                for (int j = 0; j < attrs.getLength(); j++) {
//                    System.out.println(attrs.item(j).getNodeName() + " = " + attrs.item(j).getNodeValue());
//                }
                // ǰ�᣺�Ѿ�֪�� book �ڵ�����ֻ��1��id����
                Element book = (Element) bookList.item(i);
                String idValue = book.getAttribute("id");
                System.out.println("id == " + idValue);

                NodeList childNodes = book.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    // ���ֳ� text ���͵� node �Լ� element ���͵� node
                    if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println(childNodes.item(j).getNodeName() + " == " + childNodes.item(j).getFirstChild().getNodeValue());
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
