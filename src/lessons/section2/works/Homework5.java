package lessons.section2.works;

public class Homework5 {
    public static void main(String[] args) {
        /*
         Ödev 5 -> 1'den 500 e kadar olan fibonacci sayılarını yazdırınız
         f(n-1) + f(n-2)
        */


        int n1=0,n2=1,n3,i,count=14;//declare
        for(i=0;i<count;++i)//0 ve 1 zaten yazdırıldığı için döngü 2'den başlar
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
