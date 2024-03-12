package cn.itcast.stringdemo;

public class Utils {

    /**
     格式化：GBK,[-49, -51] --> type:GBK:   0xCF 0xCD
     */
    private static void printHex(String type, byte[] data) {
        StringBuilder builder = new StringBuilder();
        builder.append("type:").append(type).append(":   ");
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            temp = data[i] & 0xFF;
            builder.append("0x").append(Integer.toHexString(temp).toUpperCase()).append(" ");
        }

        System.out.println(builder.toString());
    }
    /**
     格式化打印：0b1111 -> 二进制: 1111  十进制: 15  十六进制: F
     */
    private static void printFormatFromBinary(int binary) {
        System.out.println("二进制: "+Integer.toBinaryString(binary)+"  十进制: "+binary+"  十六进制: "+Integer.toHexString(binary).toUpperCase());
    }

    /**
     格式化打印：0xFF -> 二进制: 11111111  十进制: 255  十六进制: F
     */
    private static void printFormatFromHex(int hex) {
        System.out.println("二进制: "+Integer.toBinaryString(hex)+"  十进制: "+hex+"  十六进制: "+Integer.toHexString(hex).toUpperCase());
    }

}
