package cn.itcast.IOdemo;

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) throws Exception{
        String s ="中国";
        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks)); //[-70, -38, -62, -19]

        String s1 = new String(gbks,"UTF-8");
        System.out.println(s1); // ����

        byte[] bytes = s1.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));//[-17, -65, -67, -17, -65, -67, -17, -65, -67, -17, -65, -67]

        String s2 = new String(bytes,"GBK");
        System.out.println(s2); //锟叫癸拷
    }
}
