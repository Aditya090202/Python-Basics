package com.company;

public class Main {
    public static int digitSwapper(int input){
        int y = input/ 10 % 10;
        int x = (input / 100) * 100;
        int z = (input % 10) * 10;
        return x + y + z;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input + " " + output);


    }
}


