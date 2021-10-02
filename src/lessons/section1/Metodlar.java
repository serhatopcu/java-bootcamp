package lessons.section1;

public class Metodlar {

    public static void main(String[] args) {
        /*
             Geriye deger dondurmeyenler(void ifadesi yer alir)
             f(x,y) = x+y
             fonksiyon adi(paremetreler) = islem

             return fonksiyonu geriye deger dondurenler.(return ifadesi yer alir)
             int f(int x, int y){
                return x+y
             }

             donustipi metodadi(paremetreler){
               geriye dondur
             }

             example
             Arabanin benzin durumunu ogrenmek istedigimiz bir metod yaziyoruz.

         */
        sayHello();
        writeMessage("selam");
        writeMessage("selam java");

        int a = topla(3,5);
        System.out.println(a);

        //void ornegi
        // int b = cikartV(2021,1986); // Void metodlar yazdirma ozelligi bulundugundan bir degiskene veya bir fonksiyon arasina dahil edilemez
        // cikartV(2021,1986));

        int c= cikartR(2021,1986); // Return metodlar ise veriyi depolama ozelligi oldugundan heryerde cagiralabilir.
        //return ornegi
        //bol ve yonet

       System.out.println("Benim adim serhat " + cikartR(2021,1986) +" yasindayim. yasimin hesabi  x2021 - y1986 bu degerleri cikardigimda olusuyor");

    }


    static int topla(int sayi1,int sayi2){ //geriye deger dondurur depolama ozelligi var.
        return sayi1+sayi2;
    }

    static int cikartR(int x,int y){
        return x-y;
    }

    static void cikartV(int x,int y){
        System.out.println("Benim adim serhat 35 yasindayim. yasimin hesabi " + (x - y)  +"bu degerleri cikardigimda olusuyor");
    }

    static void writeMessage(String message){ //geriye deger dondurmeyen.
        System.out.println(message);
    }

    static void sayHello(){ //geriye deger dondurmeyen.
        System.out.println("merhaba");
    }

}
