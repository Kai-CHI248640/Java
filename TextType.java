package Domle01;

public class TextType {
    public static void main(String[] arge) {
        
        //对不同类型对变量进行定义
        byte A = -128;
        short B = -32768;
        int C = -2147483648;
        long D = -9223372036854775808L;

        long E = A * B;
        long F = C + D;
      //对变量进行打印
        System.out.println(E);
        System.out.println(F);
    }
}
