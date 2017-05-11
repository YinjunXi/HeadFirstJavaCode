package com.muhlenxi;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by yangxi on 2017/5/11.
 */
public class RentBookTest {
    public static void main(String[] args) {
        Book[] booksLibrary = new Book[10];
        booksLibrary[0] = new Book("平凡的世界",1);
        booksLibrary[1] = new Book("Thinking in Java",2);
        booksLibrary[2] = new Book("Head First Java",3);
        booksLibrary[3] = new Book("乔布斯传",4);
        booksLibrary[4] = new Book("高数",5);
        booksLibrary[5] = new Book("数据结构",6);
        booksLibrary[6] = new Book("设计模式",7);
        booksLibrary[7] = new Book("大数据",8);
        booksLibrary[8] = new Book("人工智能",9);
        booksLibrary[9] = new Book("数据分析",10);

        RentBook rentBook = new RentBook();
        rentBook.setBooksLibrary(booksLibrary);
        // 运行借书系统
        rentBook.run();






    }
}
