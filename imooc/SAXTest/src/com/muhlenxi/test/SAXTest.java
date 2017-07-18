package com.muhlenxi.test;

import com.muhlenxi.handler.SAXParserHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by yangxi on 2017/7/18.
 */
public class SAXTest {
    public static void main(String[] args) {
        // 获取一个 SAXParserFactory 的实例
        SAXParserFactory factory = SAXParserFactory.newInstance();
        // 通过 factory 获取 SAXParser 实例
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
            SAXParserHandler handler = new SAXParserHandler();

            parser.parse("books.xml", handler);
            System.out.println(" --- 共有 " +  handler.getBooks().size() + " 本书");

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
