package cn.itcast.IOdemo;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("b.txt"),"GBK");
        osw2.write("中国");
        osw2.flush();
        osw2.close();
    }
}
