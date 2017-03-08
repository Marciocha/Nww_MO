package com.sdajava.nww;

public class Main {

    public static int nwd(int a, int b) {

        while (a != b)
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
            return a;
    }

    public static int nww(int a, int b){

            return a / nwd(a, b) * b;
    }

    public static void main (String[] args){

        int a = 36;
        int b = 24;

        System.out.println("Najmniejszym wspolnym dzielnikiem liczb jest: " + nww(a,b));
    }
}
