package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

/**@serial
 * @author W S M */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            System.out.print("Podaj drugą liczbę: ");
            num2 = input.nextInt();
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
            // write your code here
        /* To jest
        komentarz
        wielolinijkowy
         */
        } while ((num1 != 0) && (num2 != 0));
    }
}