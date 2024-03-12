package cn.itcast.stringdemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "黑马";
        byte[] bytes = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes)); //[-70, -38, -62, -19]

        byte[] bytes1 = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes1)); //[-23, -69, -111, -23, -87, -84]


    }
}
