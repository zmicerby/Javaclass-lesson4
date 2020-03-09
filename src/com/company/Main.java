package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n = 100;

        boolean [] sourseArray = new boolean[n];

        for (int i = 0; i < sourseArray.length; i++) {
            sourseArray[i] = true;

        }

        sourseArray[0] = false;
        sourseArray[1] = false;

        for (int i = 2; i < sourseArray.length; i++){
            for (int j = i + 1; j < sourseArray.length; j++){
                if (j % i == 0){
                    sourseArray[j] = false;
                }
            }
        }

        for (int i = 0; i < sourseArray.length; i++){
            if(sourseArray[i]) {
                System.out.print(i + "    ");
            }
        }







    }
}
