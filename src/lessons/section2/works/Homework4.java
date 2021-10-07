package lessons.section2.works;

public class Homework4 {
    public static void main(String[] args) {
        /*
         Ödev4 -> 1'den 100'e kadar olan asal sayıları döngü yardımı ile bulunuz
         2 3 5 7 11 13 .... 83 89 97
        */

        int a=2;
        for(;a<100; a++){
            boolean isAsal = true;
            for (int b = 2;b<a; b++){
                if((a % b) == 0){ // a nin b modunu 0 a esitledik. yani asal degildir / false
                    isAsal = false;
                }
            }

            if(isAsal){//asal olmayanlari ayristirdik.true
                System.out.println(a);
            }

        }
    }
}
