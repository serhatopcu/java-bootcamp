package lessons.section2.works;

public class Homework2 {
    public static void main(String[] args) {
        /*
            Sayıları aşağıdaki düzende döngü kullanarak yazdırınız
                 1
                12
               123
              1234
             12345
            123456

            Bu Ornegi asagida biraz gelistirdim. ucgen sekline getirmek icin.
       */
        int row = 7;
        for (int a =0;a <= row;a++){
            // Sag hizalama
            for (int k =0; k < row - a; k++) { //sol bosluklari saydirma
                System.out.print("  ");//space
            }
            for (int b=1;b<a;b++){
                System.out.format("%-2d",  b);
            }

            // Sola hizalama
            for (int k =0; k < row ; k++) { //sol bosluklari saydirma
                System.out.print("");//space
            }
            for (int b=0;b<a;b++){
                System.out.format("%-2d",  b);
            }
            System.out.println();
        }

    }
}
