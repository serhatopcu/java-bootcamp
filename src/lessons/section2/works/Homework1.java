package lessons.section2.works;

public class Homework1 {
    public static void main(String[] args) {
        /*
            Ödev 1 -> Aşağıdaki şekili döbgğler ile yazıdırınız
            *
            **
            ***
            ****
            *****
        */
        int a=0;
        for (;a < 7;a++){
            for (int b=0;b < a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
