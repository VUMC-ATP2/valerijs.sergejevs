package homework;

import java.util.Currency;


public class FirstClass {
    public static void main(String[] args) {


        // Spain
        var countryName = "Spain";
        System.out.println("Country name:"+ countryName);
        double population = 47.32;
        System.out.println("Population:"+ population + "mil");
        double area = 505.909;
        System.out.println("Area:"+ area + "km2");
        var capital = "Madrid";
        System.out.println("Capital:"+ capital);
        var language = "spanish";
        System.out.println("Language:"+ language);
        boolean eu_member = true;
        System.out.println("EU Member:"+ eu_member);
        Currency sp = Currency.getInstance("EUR");
        System.out.println("Currency:"+ sp);

        // String sentences

        String mycatName = "Ljosik";
        System.out.println(mycatName);

        String mySentence = "My cat Lsjosik is very funny. He is 10 years old.";
        String mySentence2 = "He is playing with ball all day.";
        System.out.println(mySentence);
        System.out.println(mySentence2);
        System.out.println(mySentence + mySentence2);


        // +
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("sum: "+ sum);

        byte x = 123;
        short y = -32;
        int z = 1000;
        int xyz = x + y + z;
        System.out.println("xyz: "+ xyz);

        byte q = 123;
        short w = 32;
        int e = -1000;
        int qwe = (q + w) + e;
        System.out.println("qwe: "+ qwe);

        var qq = 3;
        qq = qq++ + qq++;
        System.out.println("qq: "+ qq );

        // -
        double i = 11.11;
        double u = 22.21;
        double sim = i - u;
        System.out.println("sim: "+sim);

        double c = 11.11;
        double v = 22.21;
        long n = 2000009;
        double rty = c - v - n;
        System.out.println("rty: "+ rty);

        double aa = -11.11;
        double ss = -22.21;
        long dd = 2000009;
        double aassdd = (aa - ss) - dd;
        System.out.println("aassdd: "+ aassdd);

        int ww = 84;
        int ee = ww--;
        System.out.println("ww:"+ ww);
        System.out.println("ee: "+ ee);

        // *
        int zz = 7;
        int xx = 43;
        long cc = 10000000;
        long zzxxcc = (xx - zz) * cc;
        System.out.println("zzxxcc: "+ zzxxcc);

        int mm = 10 / 5 * 90;
        System.out.println("mm: "+ mm);

        int jj = 1;
        int kk = 2;
        int hh = 3;
        jj += 3;
        kk *= 2;
        hh += a * b;
        System.out.println("jj: "+ jj);
        System.out.println("kk: "+ kk);
        System.out.println("hh: "+ hh);

        // /
        double ll = 119.99;
        double pp = 88.21;
        double llpp = 119.99 / 88.21;
        System.out.println("llpp: " +llpp);

        // %
        int rr = 11 % 9;
        double tt = 6.22 % 5.11;
        System.out.println("rr: "+ rr);
        System.out.println("tt: "+ tt);



    }















    }



