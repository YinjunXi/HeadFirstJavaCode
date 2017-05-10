package com.imooc;

/**
 * Created by yangxi on 2017/5/10.
 */
public class Telephone {
    private double screen;
    private double cpu;
    private double mem;
    public Telephone() {
        System.out.println("无参构造器");
    }
    public Telephone(double newScreen,double newCpu,double newMem) {
        System.out.println("有参构造器");
        if (newScreen < 3.5) {
            this.screen = 3.5;
            System.out.println("屏幕太小，默认配成3.5英寸");
        } else  {
            this.screen = newScreen;
        }
        this.cpu = newCpu;
        this.mem = newMem;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getMem() {
        return mem;
    }

    public void setMem(double mem) {
        this.mem = mem;
    }
}
