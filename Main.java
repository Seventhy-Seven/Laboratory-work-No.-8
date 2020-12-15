package com.company;

class Rec5 {
    public static int Fibbonacci(int n){
        if(n==0){
            return 0;
        }
        else{
            if(n==1){
                return 1;
            }
            else {
                return Fibbonacci(n-2)+Fibbonacci(n-1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibbonacci(7));

    }
}
