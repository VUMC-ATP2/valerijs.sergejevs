package homeworkTwo;


import static homeworkTwo.Average.myAverage;
import static homeworkTwo.Method2.printBusinessCardTwo;
import static homeworkTwo.Metod.printBusinessCard;
import static homeworkTwo.Sum.mySum;

public class  HomeWorkTwo {
    public static void main(String[] args) {



        int a = 4;
        System.out.println(a > 0);
        System.out.println(a < 0);
        int b = 6;
        System.out.println(b > 5 && b <= 10);
        System.out.println(b >= 5 && b < 10);
        System.out.println(b >= 5 || b < 10);
        System.out.println(b == 0 || b == 10);
        System.out.println((b * b) > 10);

         var x = 0;
         switch (x) {
             case 1:
                 System.out.println("January");
                 break;
             case 2:
                 System.out.println("February");
                 break;
             case 3:
                 System.out.println("March");
                 break;

         }

         int q = 2;
         int w = 9;
         int e = 91;
         if (q > w && q > e) {
             System.out.println(q);
         }if (w > q && w > e) {
            System.out.println(w);
        }else
        System.out.println(e);

         String krasa1 = "Sarkana";
         String krasa2 = "Dzeltena";
         String krasa3 = "Zaļa";
        System.out.println("Stop" + krasa1.equals(krasa3));
        System.out.println("Waiting" + krasa2.equals(krasa3));
        System.out.println(("GO" + krasa3.equals(krasa3)));


        printBusinessCard();
        printBusinessCard();
        printBusinessCard();


        printBusinessCardTwo("Valerijs","Sergejevs","+3712222222",1980);
        printBusinessCardTwo("Olga","Sergejeva","371 22222222",1980);

        int summa = mySum(2,7);
        System.out.println(summa);

        double avr = myAverage(3,8,90);
        System.out.println(avr);

















    }
}
