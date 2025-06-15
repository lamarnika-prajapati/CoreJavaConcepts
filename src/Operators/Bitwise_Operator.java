package Operators;

public class Bitwise_Operator {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        System.out.println("Bitwise &: "+(a&b));//0101 & 0100 = 0100:=4
        System.out.println("Bitwise |: "+(a|b));//0101 | 0100 = 0101:=5
        System.out.println("Bitwise ^: "+(a^b));//0101 ^ 0100 = 0001:=1
        System.out.println("Bitwise ^: "+(~a));//~0101 = 1010:=-6
    }
}
