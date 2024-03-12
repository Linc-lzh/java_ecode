package cn.itcast.stringdemo;

import java.io.UnsupportedEncodingException;

public class Demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*String s = "黑马";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes)); //[-23, -69, -111, -23, -87, -84]

        String str = new String(bytes);
        System.out.println(str); //黑马*/

        /*String s = "黑马";
        byte[] bytes = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes)); //[-70, -38, -62, -19]

        String str = new String(bytes,"GBK");
        System.out.println(str); //黑马*/

        /*String s = "♠";
        byte[] bytes = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes)); //[-70, -38, -62, -19]

        String str = new String(bytes,"GBK");
        System.out.println(str); //黑马*/

        /*String s = "黑马";
        byte[] bytes = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes)); //[-70, -38, -62, -19]

        String str = new String(bytes,"ISO-8859-1");
        System.out.println(str); //ºÚÂí

        byte[] bytes1 = str.getBytes("ISO-8859-1");
        System.out.println(Arrays.toString(bytes1));//[-70, -38, -62, -19]

        String str1 = new String(bytes1, "GBK");
        System.out.println(str1);//黑马*/

    }
}
