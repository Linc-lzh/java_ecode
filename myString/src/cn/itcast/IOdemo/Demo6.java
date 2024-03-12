package cn.itcast.IOdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo6 {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\1.jpg"),"ISO-8859-1");
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("D:\\code\\2.jpg"),"ISO-8859-1");
        int ch;
        while ((ch=isr.read())!=-1) {
            osw2.write(ch);
        }
        isr.close();
        osw2.close();
    }
}
