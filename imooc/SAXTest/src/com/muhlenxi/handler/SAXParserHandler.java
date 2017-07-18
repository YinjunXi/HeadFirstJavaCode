package com.muhlenxi.handler;

import com.muhlenxi.com.muhlenxi.entity.Book;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/**
 * Created by yangxi on 2017/7/18.
 */
public class SAXParserHandler  extends DefaultHandler{

    int bookIndex = 0;
    String value = "";
    Book book = new Book();
    private  ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    // ���� xml Ԫ��
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        // ��ʼ���� book Ԫ�ص�����
        if (qName.equals("book")){
            bookIndex++;
            book = new Book();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                System.out.println(attributes.getQName(i));
                System.out.println(attributes.getValue(i));
                if (attributes.getQName(i).equals("id")){
                    book.setId(attributes.getValue(i));
                }
            }
            String value = attributes.getValue("id");
            System.out.println("book ������ֵ�ǣ�" + value);
        } else if (!qName.equals("bookstore")) {
            System.out.print("�ڵ����ǣ�" + qName + " �ڵ�ֵ�ǣ�");
        }
    }

    //
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (qName.equals("book")) {
            books.add(book);
            book = null;
            System.out.println("========== ���������� " + bookIndex + " ���� =====");
        } else if (qName.equals("name")) {
            book.setName(value);
        } else if (qName.equals("author")) {
            book.setAuthor(value);
        } else if (qName.equals("year")) {
            book.setYear(value);
        } else if (qName.equals("price")) {
            book.setPrice(value);
        } else if (qName.equals("language")) {
            book.setLanguage(value);
        }
    }

    // ������ʶ������ʼ
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("SAX ������ʼ");
    }

    // ������ʶ��������
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("SAX ��������");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        value = new String(ch, start, length);
        if (!value.trim().equals("")) {
            System.out.println(value);
        }

    }
}
