package homework;


import java.util.Arrays;
import java.util.Scanner;

import static homework.Factorial.Factrorial;




public class LoopHomeWork {

    private static final int VARIABLE_NAME = 7777;

    public static void main(String[] args) {


        int x = 10;
        do {
            System.out.println("Ne gatavs");
            x++;
        }
        while (x > 100);
        System.out.println("Gatavs");

        System.out.println("##########");


        int num = 1;
        int y;

        for (y = 2; y < num; y++) ;
        if (num % y == 0) {
            System.out.println("Not simple number");
        } else {
            System.out.println("Its simple");
        }

        System.out.println("#################");

        int[] price = {36000, 44000, 29000};
        String[] cars = {"Audi", "BMW", "Opel"};
        char[] category = {'L', 'B', 'C'};
        while (price[2] < 29001) {
            System.out.println("Mark: " + cars[2]);
            System.out.println("Category: " + category[2]);
            break;

        }
        do {
            System.out.println("Mark: " + cars[0]);
            System.out.println("Category: " + category[0]);
            break;


        }
        while (price[1] > price[2]);

        for (int i = 0; i < price[1]; i++) {
            System.out.println(price[1]);
            break;
        }

        for (String b : cars) {
            System.out.println(b);
            break;
        }

        System.out.println("#####################");


        int[] arr = new int[100];
        int evenNums = 0;

        for (int a = 0; a < 100; a++) {
            arr[a] = (int) (Math.random() * (100 + 1));
            if (arr[a] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("####################");


        System.out.println(Factrorial(3));


        int P = VARIABLE_NAME;
        int userPin = 0;
        int count = 0;
        Scanner SC = new Scanner(System.in);
        while(count < 3){
            count++;

            System.out.println(count + " Ievadi pin kodu: ");
            userPin = SC.nextInt();

            if(userPin == P){

                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            }
            else{
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
            }
        }
        if(count == 3){
            System.out.println("Atvainojiet, bet jūs esat bloķēts");
        }








    }
}