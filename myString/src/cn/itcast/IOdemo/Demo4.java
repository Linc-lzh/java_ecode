package cn.itcast.IOdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("b.txt"),"UTF-8");
        int ch;
        while ((ch=isr.read())!=-1) {
            osw2.write(ch);
        }
        isr.close();
        osw2.close();
    }
}
