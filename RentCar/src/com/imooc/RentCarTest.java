package com.imooc;

import java.util.Scanner;

/**
 * Created by muhlenXi on 2017/5/10.
 */
public class RentCarTest {
    public static void main(String[] args) {
        System.out.println("欢迎使用答答租车系统");
        System.out.println("您是否要租车：1是 0否");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        int rentCount = 0;
        int rentDays = 0;
        if (choose == 1) {
            System.out.println("您可租车的类型及其价目表：");
            System.out.println("序号  汽车名称    租金      容量");
            System.out.println("1.   奥迪A4     500元/天   载人：4人");
            System.out.println("2.   马自达6    400元/天   载人：4人");
            System.out.println("3.   皮卡雪6    450元/天   载人：4人  载货：2吨");
            System.out.println("4.   金龙       800元/天   载人：20人");
            System.out.println("5.   松花江     400元/天    载货：4吨");
            System.out.println("6.   依维柯     1000元/天   载货：20吨");

            System.out.println("请输入您要租汽车的数量：");
            rentCount = scanner.nextInt();
            int[] chooseCarNumberArray = new int[rentCount];
            for (int i = 0; i < rentCount; i++) {
                System.out.println("请输入第" + (i+1) + "辆车的序号：");
                chooseCarNumberArray[i] = scanner.nextInt();
            }
            System.out.println("请输入租车天数:");
            rentDays = scanner.nextInt();

            // 数据处理
            Car[] chooseCarArray = new Car[rentCount];
            for (int i = 0; i < rentCount ; i++)
                switch (chooseCarNumberArray[i]) {
                    case 1:
                        Sedan aodi = new Sedan();
                        aodi.serialNumber = 1;
                        aodi.name = "奥迪A4";
                        aodi.price = 500;
                        aodi.rentDays = rentDays;
                        aodi.passengerNumber = 4;
                        chooseCarArray[i] = aodi;
                        break;
                    case 2:
                        Sedan mazida = new Sedan();
                        mazida.serialNumber = 2;
                        mazida.name = "马自达6";
                        mazida.price = 400;
                        mazida.rentDays = rentDays;
                        mazida.passengerNumber = 4;
                        chooseCarArray[i] = mazida;
                        break;
                    case 3:
                        UtilityTruck pika = new UtilityTruck();
                        pika.serialNumber = 3;
                        pika.name = "皮卡雪6";
                        pika.price = 450;
                        pika.rentDays = rentDays;
                        pika.passengerNumber = 4;
                        pika.carryCount = 2;
                        chooseCarArray[i] = pika;
                        break;
                    case 4:
                        Bus jinlong = new Bus();
                        jinlong.serialNumber = 4;
                        jinlong.name = "金龙";
                        jinlong.price = 800;
                        jinlong.rentDays = rentDays;
                        jinlong.passengerNumber = 20;
                        chooseCarArray[i] = jinlong;
                        break;
                    case 5:
                        Truck songhuajiang = new Truck();
                        songhuajiang.serialNumber = 5;
                        songhuajiang.name = "松花江";
                        songhuajiang.price = 400;
                        songhuajiang.rentDays = rentDays;
                        songhuajiang.carryCount = 4;
                        chooseCarArray[i] = songhuajiang;
                        break;
                    case 6:
                        Truck yiweike = new Truck();
                        yiweike.serialNumber = 6;
                        yiweike.name = "依维柯";
                        yiweike.price = 1000;
                        yiweike.rentDays = rentDays;
                        yiweike.carryCount = 20;
                        chooseCarArray[i] = yiweike;
                        break;
                    default:
                        break;

                }

            // 计算过程
            int allPassenger = 0;
            double allCount = 0;
            double allCost = 0;
            String carryPersonDescription = "";
            String carryCargoDescription = "";

            for (int i = 0; i < rentCount; i++) {
                Car car = chooseCarArray[i];
                if (car instanceof Sedan) {
                    allPassenger += ((Sedan) car).passengerNumber;
                    carryPersonDescription += ((Sedan) car).name;
                    carryPersonDescription += " ";
                } else if (car instanceof Bus){
                    allPassenger += ((Bus)car).passengerNumber;
                    carryPersonDescription += ((Bus) car).name;
                    carryPersonDescription += " ";
                } else if (car instanceof UtilityTruck) {
                    allPassenger += ((UtilityTruck) car).passengerNumber;
                    allCount += ((UtilityTruck) car).carryCount;
                    carryPersonDescription += ((UtilityTruck) car).name;
                    carryPersonDescription += " ";
                    carryCargoDescription += ((UtilityTruck) car).name;
                    carryCargoDescription += " ";
                } else if (car instanceof Truck) {
                    allCost += ((Truck) car).carryCount;
                    carryCargoDescription += ((Truck) car).name;
                    carryCargoDescription += " ";
                }
                allCost += car.price * car.rentDays;
            }

            // 输出结果
            System.out.println("***可载人的车有：" + carryPersonDescription + "共载人：" + allPassenger + "人");
            System.out.println("***载货的车有：" + carryCargoDescription +"共载货：" + allCount + "吨");
            System.out.println("租车总价格：" + allCost + "元");


        } else  {
            System.out.println("您已经退出答答租车系统！");
        }
    }
}
