package lessons.section2.works;

public class Homework3 {
    public static void main(String[] args) {
        /*
         aşağıdaki şekili döngüler ile yazdırınız
                **
               ****
              ******
             ********
         */
        int row = 6;
        for (int i = 0; i <= row; i++){// alt alta listeleme
            for (int k =0; k < row - i; k++) { //sol bosluklari saydirma
                System.out.print("  ");//space
            }
            for (int j =0; j <2*i-1; j++){// bir satirdaki yildiz sayisi
                System.out.print("**");
            }
            System.out.print("\n"); //alt satira gec
        }
    }
}
