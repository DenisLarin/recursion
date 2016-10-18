package ru.larin;

import java.util.Scanner;

/**
 * Created by mrden on 18.10.2016.
 */
public class Nechotnay14 {
    public static void main(String[] args) {
        nechent(0,1);
    }

    private static void nechent(int num1, int cout) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 0){
            if(cout % 2 == 0){
                nechent(number,++cout);
            }
            else{
                System.out.println(number);
                nechent(number,++cout);
            }
        }
        else return;
    }
}
