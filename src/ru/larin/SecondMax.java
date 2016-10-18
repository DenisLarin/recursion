package ru.larin;

import java.util.Scanner;

/**
 * Created by mrden on 18.10.2016.
 */
public class SecondMax {
    public static void main(String[] args) {
        secondmax(0,0);
    }

    private static void secondmax(int max1, int max2) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            if(number>max1){
                secondmax(number,max1);
            }
            else if(number>max2){
                secondmax(max1, number);
            }
            else{
                secondmax(max1,max2);
            }
        }
        else {
            System.out.println(max2);
        }
    }
}
