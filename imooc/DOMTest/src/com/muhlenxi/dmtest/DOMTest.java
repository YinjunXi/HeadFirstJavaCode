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
            // 创建 DocumentBuilder 对象
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            // 加载文件
            Document document = documentBuilder.parse("books.xml");
            // 获取所有 book 节点的集合
            NodeList bookList = document.getElementsByTagName("book");
            System.out.println("一共有 " + bookList.getLength() + " 本书");
            // 遍历每一个 book 节点
            for (int i = 0; i < bookList.getLength();i++) {
//                Node book = bookList.item(i);
                // 获取 book 节点的所有属性集合
//                NamedNodeMap attrs = book.getAttributes();
//                System.out.println("第" + (i+1) + "本书" + "共有" + attrs.getLength() + "个属性");
//                for (int j = 0; j < attrs.getLength(); j++) {
//                    System.out.println(attrs.item(j).getNodeName() + " = " + attrs.item(j).getNodeValue());
//                }
                // 前提：已经知道 book 节点有且只有1个id属性
                Element book = (Element) bookList.item(i);
                String idValue = book.getAttribute("id");
                System.out.println("id == " + idValue);

                NodeList childNodes = book.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    // 区分出 text 类型的 node 以及 element 类型的 node
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
