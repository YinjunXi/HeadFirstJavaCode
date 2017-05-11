package com.muhlenxi;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by yangxi on 2017/5/11.
 */
public class RentBook {

    private Book[] booksLibrary;  // 图书库
    public Book[] getBooksLibrary() {
        return booksLibrary;
    }
    public void setBooksLibrary(Book[] booksLibrary) {
        this.booksLibrary = booksLibrary;
    }

    public void run() {
        String checkName;
        int checkSerialNumber;
        int choose;
        System.out.println("XX借书系统欢迎你");
        System.out.println("输入命令：1-按书名查找图书；2-按照序号查找图书");
        Scanner scanner = new Scanner(System.in);
        try {
            choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("输入图书名称：");
                checkName = scanner.next();
                Book result ;
                try {
                    result = checkBookByName(checkName);
                    System.out.println(result);
                } catch (BookNotExistException e) {
                    System.out.println(e.toString());
                    run();
                }
            } else if (choose == 2) {
                System.out.println("输入图书序号：");
                checkSerialNumber = scanner.nextInt();
                Book result ;
                try {
                    result = checkBookByNumber(checkSerialNumber);
                    System.out.println(result);
                } catch (BookNotExistException e) {
                    System.out.println(e.toString());
                    run();
                }
            } else {
                System.out.println("命令输入错误！请根据提示输入数字命令！");
                run();
            }
        } catch (InputMismatchException e) {
            System.out.println("命令输入错误！请根据提示输入数字命令！");
            run();
        }
    }

    // 根据名称查找图书
    public Book checkBookByName(String name) throws BookNotExistException{
        for (Book book :
                booksLibrary) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        throw new BookNotExistException("图书不存在");
    }

    // 根据序号查找图书
    public Book checkBookByNumber(int number) throws BookNotExistException{
        for (Book book :
                booksLibrary) {
            if (book.getSerialNumber() == number) {
                return book;
            }
        }
        throw new BookNotExistException("图书不存在");
    }

    @Override
    public String toString() {
        return "RentBook{" +
                "booksLibrary=" + Arrays.toString(booksLibrary) +
                '}';
    }



}
