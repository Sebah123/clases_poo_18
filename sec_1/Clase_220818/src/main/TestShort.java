package main;

public class TestShort {
    public static void main(String[] args) {
        short a = 2;
        short b = 3;
        // incompatible types: possible lossy conversion from int to short
        //short c = a + b;
        //short c = (short)(a + b);
        int c = a + b;
        
        byte d = 3;
        byte e = 2;
        // incompatible types: possible lossy conversion from int to byte
        //byte f = d + e;
        //byte f = (byte)(d + e);
        int f = d + e;
        
        
        int aa = Integer.MAX_VALUE;
        int bb = Integer.MAX_VALUE;
        int cc = aa + bb;
        
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }
}
