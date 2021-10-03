package lessons.section2;

public class Loops {
    public static void main(String[] args) {
        /*
            WHILE LOOP
            DO WHILE LOOP
            FOR LOOP


            //CONDITION sart
            //STATEMENT islem
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
        while (a<6){
            int b=1;
            while (b<6){
                System.out.println(a +" x " + b +" = "+ (a*b) );
                b++;
            }
            a++;
            System.out.println();
        }
        System.out.println("-----------Do While-----------------");

        int dwa =1;
        do{
            System.out.println(dwa);
            dwa++;
        }while (dwa<5);

        //isim girene kadar
    }
}
