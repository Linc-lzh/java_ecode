package cn.itcast.stringdemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        System.out.println(new String(bytes,"GBK"));
    }
}
