package lessons.section2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //next ve nextline farki next sadece bosluga kadar okuyabiliyor degerleri

        //While();
        //doWhile();
        //For();
        //System.exit(1);
        //Example1();
        //Example2();
        //Example3();
        //Example4();
        Example5();

    }


    public static void Example5() {
        /*
            DO NOT
         */
        Scanner kb = new Scanner(System.in);

        int sum = 0;
        int num;
        /*
            for(int i =0; i < 10; i++);
            1. akis for dongusune geldiginde ilk kez ve birkez yapilacak kisimdir.
            2. For dongusunun kosul kismidir boolean bir ifadedir. i < 10 kosulu true ve false bildirir.ve sayiyi 3. kisima bagli azaltir ve yukseltir.
            3. Dongunun bir adimi tamamladiginda bir sonraki adima gecmek icin yapacagi kontrolden hemen once incra edilir.
         */
        for (System.out.println("Start entering numbers"),System.out.print("num:");
             (num =Integer.parseInt(kb.nextLine()))!= 0;
             sum += num, System.out.print("num:"));
        System.out.printf("Sum: %d%n ", sum);

    }
    public static void Example4() {
         /*
            Basamak sayilarinin toplami
            Mod hesabi 246/10 kalan sayi mod dur.
            246 % 10 = 6  126 % 10 = 6
            11 % 3 = 2
            5 % 2 = 2

            248 = 2 + 4 + 8 = 12
            127 = 1 + 2 + 7 = 12

            248 % 10 = 8
            248 / 10 = 24
            24 % 10 = 4
            24 / 10 = 2
            2 % 10 = 2
        */
        Scanner scanner = new Scanner(System.in);
        int num;

        while ((num = Integer.parseInt(scanner.nextLine())) != 0){
            int sumOfNumbersDigits = Example4getDigitsSum(num);
            System.out.printf("The sum of the digits of %d is : %d%n", num , sumOfNumbersDigits);
            System.out.println("Enter a number: ");
        }
    }

    public static int Example4getDigitsSum(int num) {
        int sum = 0;
        while (num != 0){
            sum += num % 10;//kalan degeri alir
            num /=10; // kalan deger 10 na bolunur.
        }
        return sum;

    }
    public static void Example3() {
        /*
            Dongu icerisinde sayinin kac basamakli oldugunun bulunmasi
        */
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num;
        while ((num = Integer.parseInt(kb.nextLine())) != 0){
            int countOfDigits = Example3getDigitsCount(num);
            System.out.printf("The number if digits %d is : %d%n", num, countOfDigits);
            System.out.print("Enter a number");

        }
        System.out.println("The number of digits 0 is :1");
    }

    public static int Example3getDigitsCount(int num){
        if(num == 0)
            return 1;

        int count =0;
        while (num !=0){
            ++count;
            num /=10;
        }

        return count;
        /*
            1234=(1*1000) + (2 * 100) + (3*10) + (4*1)

            1234 / 10 count =2
            123 /  10 count =3
            12 /   10 count =4
            2 /    10 count =0.05==0
         */
    }

    public static void Example2() {
        //while ile pozitif ve negatif sayilarin ayri ayri toplami bulunmustur.
        Scanner kb =new Scanner(System.in); // Klavyeden gelen degeri alma
        System.out.println("Start entering numbers: ");

        int positiveSum = 0;
        int negativeSum = 0;
        int num;
        while ((num  = Integer.parseInt(kb.nextLine())) != 0){
            if(num > 0)
                positiveSum += num;
            else
                negativeSum += num;
            Example2displayResult(positiveSum,negativeSum);
        }
    }

    public static void Example2displayResult(int positiveSum,int negativeSum){
        if(positiveSum > 0)
            System.out.printf("Sum of positive numbers : %d%n", positiveSum );
        else
            System.out.println("You did not enter any positive numbers");

        if(negativeSum < 0)
            System.out.printf("Sum of Negative numbers : %d%n", negativeSum );
        else
            System.out.println("You did not enter any negative numbers");
    }

    public static void Example1() {
        System.out.println("Girilen deger 0 olana kadar toplama islemi");
        Scanner kb = new Scanner(System.in);
        System.out.println("Start Entering numbers : ");

        int sum = 0;
        int num;
        while ((num = Integer.parseInt(kb.nextLine())) != 0){ //parse donusturme parseInt string degeri int e donusturur.
            //0 olana kadar true
            sum += num;
            System.out.printf("Sum : %d%n", sum ); // %d sum ifadesini cagirir %n bir alt satira gecer.
        }
    }

    public static void While() {

        //CONDITION sart
        //STATEMENT islem

        /*
            Kosul deyimi dogru oldugu surece bir ifadeyi veya blogu calistirir.
            while(condition){
                statement
            }
        */
        System.out.println("----------While-----------------");
        int j=1;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        //Example Carpim tablosu
        System.out.println("Carpim Tablosu");
        int a = 1;
        while (a<4){
            int b=1;
            while (b<4){
                System.out.println(a +" x " + b +" = "+ (a*b) );
                b++;
            }
            a++;
            System.out.println();
        }

    }

    public static void doWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------Do While-----------------");

        int dwa =10;
        do{
            System.out.println(dwa);
        }while (dwa-- > 0);

        String name = "";

        do{
            name = scanner.next();
        }while(name.isEmpty());

        System.out.println("Name : " + name);
        //isim girene kadar

    }

    public static void For() {
        System.out.println("-------------For Loop-------------");
        /*
        initialization > condition true > statement -> incr/decr +/-
                                   false>
         */

        for(int fa=0; fa<5; fa++ ){ //fa+=2 fa-- fa-=1 arttirma ve azaltma parametreleri
            System.out.println(fa);
        }

        String words ="Hello World";

        for(int fi=0; fi<words.length();fi++){
            System.out.println("["+words.charAt(fi)+ "]");
        }

        //sonsuz dongu
        //for(;;){
        //System.out.println("hello");
        //}

        //ic ice matrix
        int counter = 1;
        for(int fc = 0; fc<3; fc++){
            for (int fb=0;fb<3;fb++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
