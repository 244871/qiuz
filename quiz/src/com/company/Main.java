package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podpunkt 1");
        bigintiger();
        System.out.println();
        System.out.println("Podpunkt 2");
        silnie();
    }

    public static void bigintiger() {
        BigInteger a = new BigInteger("-12446861323453");
        BigInteger b = new BigInteger("156437865423");
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b = " + a.add(b).toString());
        System.out.println("a - b = " + a.subtract(b).toString());
        System.out.println("a * b = " + a.multiply(b).toString());
        System.out.println("a / b = " + a.divide(b).toString());
    }

    public static float silnia1(int n){
            if (n < 1)
                return 1;
            else
                return n * silnia1(n - 1);
    }
    public static BigInteger silnia2(BigInteger n){
        BigInteger zero=new BigInteger("0");
        BigInteger one=new BigInteger("1");
        if (n.equals(zero)) {
            return one;
        }
        else {
            return n.multiply(silnia2(n.subtract(one)));
        }
    }
    public static void silnie(){
        //BigInteger s=new BigInteger(String.valueOf(silnia2("423456453212")));
        for(int i=1; i<=30; i++) {
            System.out.println("Dla liczby równej: "+i);
            System.out.println(silnia1(i));
            System.out.println(silnia2(BigInteger.valueOf(i)));
        }
    }


}
