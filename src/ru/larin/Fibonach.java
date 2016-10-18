package ru.larin;

/**
 * Created by mrden on 18.10.2016.
 */
public class Fibonach {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(fibbonach(i));
        }
    }

    private static int fibbonach(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibbonach(n-1)+fibbonach(n-2);
    }
}
