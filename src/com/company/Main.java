package com.company;

import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 4;
        String userStr;
        int[] user = new int[n];
        Scanner input = new Scanner(System.in);
        userStr = input.next();
        for (int i = 0; i < n; i++) {
            user[i] = Character.getNumericValue(userStr.charAt(i));
        }
        //for(int i=0; i < n; i++)
            //System.out.print(user[i]);

        int[] computer = new int[n];
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            while(true)
            {
                computer[i] = (int)(Math.random() * 10);
                if (myHashSet.contains(computer[i])) {
                    continue;
                }
                else {
                    myHashSet.add(computer[i]);
                    break;
                }
            }
        }
        for(int i=0; i < computer.length; i++)
            System.out.print(computer[i]);
        System.out.println();

        int bukov = 0;
        int korov = 0;
        for (int i = 0; i < n; i++){
            if (computer[i]==user[i]){
                bukov ++;
            }
            for (int j = 0; j < n; j++){

                if (computer[i]==user[j] && computer[i]!=user[i]) {
                    korov++;
                }
            }
        }
        //System.out.println();
        System.out.println(bukov + " bukov " + korov + " korov");

    }
}
