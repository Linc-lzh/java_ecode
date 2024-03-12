package cn.itcast.IOdemo;

import java.io.FileInputStream;


public class Demo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\code\\bom.txt");
        int by;
        while ((by = fis.read())!=-1){
            System.out.println(by); //239 187 191
        }
    }
}
