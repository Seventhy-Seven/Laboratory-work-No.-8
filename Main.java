package com.company;

class Converter{

    private static String Converter(int x){
        if(x == 0) return "0";

        int binNum = x/2;
        int reminder = x%2;

        return Converter(binNum) + reminder;
    }

    public static void main(String[] args) {
        int num = OtherClass.reader();
        System.out.print("Число "+num+" в двоичной системе "+Converter(num));
    }
}
