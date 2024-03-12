package cn.itcast.stringdemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // public byte[] getBytes();
        /*String property = System.getProperty("file.encoding");
        System.out.println(property); //UTF-8
        String s = "黑马";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));*/ // [-23, -69, -111, -23, -87, -84]

        //  用什么样的编码 把“黑马” 进行的编码。 UTF-8编码。


        //public byte[] getBytes(String  charsetName);
        String s = "黑马";
        byte[] bytes = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes)); //[-23, -69, -111, -23, -87, -84]

        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks)); //[-70, -38, -62, -19]


        //public String(byte[] bys);

        byte[] bys = {-23, -69, -111, -23, -87, -84};
        String s1 = new String(bys);
        System.out.println(s1);

        //public String(byte[] bys, String charsetName);

        byte[] bys1 = {-70, -38, -62, -19};
        String s2 = new String(bys1,"GBK");
        System.out.println(s2);
    }
}
