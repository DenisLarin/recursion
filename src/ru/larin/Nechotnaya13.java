package ru.larin;

import java.util.Scanner;

/**
 * Created by mrden on 18.10.2016.
 */
public class Nechotnaya13 {
    public static void main(String[] args) {
        nechetn();
    }

    private static void nechetn() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            if(number%2 == 0){
                nechetn();
            }
            else{
                System.out.println(number);
                nechetn();
            }
        }
        else
            return;
    }
}
