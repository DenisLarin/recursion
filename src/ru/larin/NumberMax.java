package ru.larin;

import java.util.Scanner;

/**
 * Created by mrden on 18.10.2016.
 */
public class NumberMax {
    public static void main(String[] args) {
        number_of_max(0,0);
    }

    private static void number_of_max(int max, int num) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            if(number>max){
                number_of_max(number,1);
            }
            else if(number == max){
                number_of_max(max,++num);
            }
            else number_of_max(max,num);
        }
        else System.out.println(num);
    }
}
