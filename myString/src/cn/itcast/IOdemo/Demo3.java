package cn.itcast.IOdemo;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1) {
            System.out.print((char)ch);
        }
        isr.close();
    }
}
