import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        /*
1) 2.5
2) 2.6
3) 2.13
4) 2.19
5) 4.9
6) 4.10
7) 4.13
8) 4.36
9) 4.96
10) 4.97
11) 4.122
         */
        //2.5
        int days = 234;
        int weeks = 0;
        int a = 0;
        for (int i = 0; i < days; i++) {
            if(a==7){
                weeks = weeks +1;
                a = 0;
            }
            a++;
        }
        System.out.println(weeks);

        //2.6

        int n =60000;
        int hours = n/3600;
        int mins = n % 3600 / 60;
        int secs = n%60;

        System.out.println(mins);

        //2.13
        int number = 865;

        int last = number/100;
        int pre_last = number%100/10;
        int first = number%10;
        System.out.println(first+""+pre_last+""+last);

        //2.19
        int x =5568;
        a = x % 10;
        int b = x / 10 % 10;
        int c = x / 100 % 10;
        int d = x/1000;
        System.out.println(a + b + c + d);

        //4.9
        double km_hour = 100;
        double metr_sec = 100;


        System.out.println(max(km_hour,metr_sec));

        //4.10
        double radius = 100;
        double side = 40;

        double s1 =Math.round(Math.PI * Math.pow(radius,2)); // находим площадь круга
        double s2 = Math.round(Math.pow(side,2)); // находим площадь квадрата
        System.out.println(s1+","+ s2);

        //4.13
        double a_1 = 1;
        double b_1 = 4;
        double c_1 = 3;

        double D = Math.pow(b_1,2) - 4 * a_1 *c_1;
        boolean HaveKorni = false;

        if (D>=0) {
            double x_1 = (-b_1+Math.sqrt(D))/(2*a_1);
            double x_2 = (-b_1-Math.sqrt(D))/(2*a_1);
            System.out.println(HaveKorni = true);
            System.out.println(String.format("%.1f",x_1)+","+String.format("%.1f",x_2));
        }else{
            System.out.println(HaveKorni);
        }

        // 4.36
        double t = 8;
        for (double i = 0; i < 5; i +=5) {
            if ((t % 5) < 3 && (t % 5) >= 0) {
                System.out.println("зеленый");
            }
            if ((t % 5) >= 3 && (t % 5) < 4) {
                System.out.println("жёлтый");
            }
            if ((t % 5) >= 4 && (t % 5) < 5) {
                System.out.println("красный");
            }
        }
        //4.96
        double a_2 = 1;
        double b_2 = -4;
        double c_2 = 3.34;

        double D_1 = Math.pow(b_2,2) - 4 * a_1 * c_2;

        if (D_1 >=0) {
            double x_1 = (-b_2 +Math.sqrt(D_1))/(2*a_2);
            double x_2 = (-b_2 -Math.sqrt(D_1))/(2*a_2);
            System.out.println("Вещественные корни есть");
            System.out.println(String.format("%.2f",x_1)+"; "+String.format("%.2f",x_2));
        }else{
            System.out.println("Вещественных корней нет");
        }

        //4.97
        int numb1 = 1;
        int numb2 = 8;
        int numb3 = -10;

        int TheBiggest = 0;
        if (numb1 > numb2 && numb1 > numb3) {
            TheBiggest = numb1;
        } else if (numb2 > numb1 && numb2 > numb3){
            TheBiggest = numb2;
        } else {
            TheBiggest = numb3;
        }

        int TheSmallest = 0;
        if (numb1 < numb2 && numb1 < numb3) {
            TheSmallest = numb1;
        } else if (numb2 < numb1 && numb2 < numb3){
            TheSmallest = numb2;
        } else {
            TheSmallest = numb3;
        }

        int TheAverage = 0;
        if (numb1 != TheBiggest && numb1 !=TheSmallest) {
            TheAverage = numb1;
        } else if (numb2 != TheBiggest && numb2 !=TheSmallest){
            TheAverage = numb2;
        } else {
            TheAverage = numb3;
        }
        System.out.println("Наименьшее "+TheSmallest);
        System.out.println("Наибльшее "+TheBiggest);
        System.out.println("Среднее "+TheAverage);

        //4.122
        a_2 = 1;
        b_2 = 4;
        c_2 = 3.34;
        if((a_2<b_2+c_2) && (b_2<a_2+c_2) && (c_2<a_2+b_2)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //ЗАДАЧА №766

        Scanner sn = new Scanner("10 11 12");
        int N = sn.nextInt();
        int M = sn.nextInt();
        int K = sn.nextInt();

        if(N*M>=K) {
            System.out.println(true);
        } else
            System.out.println(false);

        //ЗАДАЧА №195
        Scanner sn_1 = new Scanner("10 11 12");
        n = sn_1.nextInt();
        a = sn_1.nextInt();
        b = sn_1.nextInt();
        System.out.println(2*a*b*n);
    }

    public static double max(double x, double y){
        if (x > y*3.6) {
            return x;
        }
        return y*3.6;
    }
}




