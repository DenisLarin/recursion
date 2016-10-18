package ru.larin;

import java.util.Scanner;

/**
 * Created by mrden on 18.10.2016.
 */
public class Firstmax {
    public static void main(String[] args) {
        firstmax(0);
    }

    private static void firstmax(int max1) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            if(number>max1){
                firstmax(number);
            }
            else {
                firstmax(max1);
            }
        }
        else {
            System.out.println(max1);
        }
    }
}
