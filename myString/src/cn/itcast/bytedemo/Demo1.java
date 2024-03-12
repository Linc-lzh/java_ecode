package cn.itcast.bytedemo;

public class Demo1 {
    public static void main(String[] args) {
        char c = '贤';
        char c1 = '\u8d24'; // \ 代表的是转义的意思  u Unicode编码
        char c2 = 36132;
        char c3 = 0x8d24;

        char c4 = 'A';
        char c5 = 65; //00

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
