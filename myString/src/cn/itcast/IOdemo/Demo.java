package cn.itcast.IOdemo;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo {
    public static void main(String[] args) throws Exception {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("myString\\a.txt"),"GBK"); // 使用GBK编码读取osw.txt文件
        int ch;
        while ((ch=isr.read())!=-1) {
            System.out.print((char)ch);
        }
        isr.close();*/

        /*OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("myString\\a.txt"));
        osw2.write("中国");
        osw2.close();*/
        byte[] bys = new byte[]{-70, -38, -62, -19};
        String s = new String( bys,"ISO-8859-1");
        System.out.println(s);

        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\1.jpg"),"ISO-8859-1");
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("d:\\2.jpg"),"ISO-8859-1");
        int ch;
        while ((ch=isr.read())!=-1) {
            osw2.write(ch);
        }
        isr.close();
        osw2.close();


    }
}
