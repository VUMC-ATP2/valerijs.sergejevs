package homework;

public class Factorial {
    public static int Factrorial(int b){
        int res = 1;
        for(int a = 1; a <= b; a++ ){
            res = res * a;
        }
        return res;
    }
}
