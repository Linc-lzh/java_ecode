package cn.itcast.stringdemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //test1();
        test2();
    }

    //验证可逆
    public static void test1() throws UnsupportedEncodingException {
        String s = "黑马";
        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks)); //[-70, -38, -62, -19]

        String str = new String(gbks,"UTF-8");
        System.out.println(str);//����

        String str1 = new String(gbks,"GBK");
        System.out.println(str1); //黑马


    }

    //验证不可逆
    public static void test2() throws UnsupportedEncodingException {
       //String s = "黑马";
        //String s = "\uD842\uDFB7";
        String s = "♥";
        System.out.println(s);  //  ji 在GBK中 没有这个字符。 GBK 编码 不能表示 ♥
        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks)); //[63]  -- ？

        String s1 = new String(gbks,"GBK");
        System.out.println(s1); //?

        String s2 = new String(gbks,"UTF-8");
        System.out.println(s2); //?
    }
}
