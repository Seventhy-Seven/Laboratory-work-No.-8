package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Rec_3{

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        printRecursive(OtherClass.recursiveInput(new ArrayList<>()));
    }

    private static void printRecursive(ArrayList<Integer> nums) {

        if(nums.size() == 0) {
            System.out.println();
            return;
        }

        int num = nums.remove(0);
        System.out.print(num + " ");
        printRecursive(nums);
    }
}
