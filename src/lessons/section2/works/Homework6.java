package lessons.section2.works;

public class Homework6 {
    public static void main(String[] args) {
        int a,b,c,num;
        int leng = 7;
        for (a=0; a < leng;a++){
            for(c=leng;c>a;c--)
                System.out.print(" ");
                num=1;

            for(b =0; b<=a; b++){
                System.out.print(num+" ");
                num = num *(a-b)/(b+1);
            }
            System.out.println();

        }
    }
}
