package hafta_3;

import java.util.Scanner;

public class harfnotu {
 public static void main(String[] args) {
        /*Bir öğrencinin klavyeden girilen 100 lük notunu harfe çeviren bir program yazılması
istenilmektedir. Aşağıdaki kurallara göre harf notu ekrana yazdırılmak istenmektedir,
 0<=notu<25  F
 25<=notu<45  E
 45<=notu<55  D
 55<=notu<70  C
 70<=notu<85  B
 85<=notu<=100  A */

     Scanner giris = new Scanner(System.in);

     double not;
    System.out.println("Notu giriniz: ");
    not = giris.nextDouble();

    if(not>=0 && not<25) 
        System.out.println("F aldınız");
    else if(not>=25 && not<45)
        System.out.println("E aldınız");
    else if(not>=45 && not<55)
        System.out.println("D aldınız");
    else if(not>=55 && not<70)
        System.out.println("C aldınız");
    else if(not>=70 && not<85)
        System.out.println("B aldınız");
    else
        System.out.println("A aldınız");

    giris.close();
   









    


    

 }
}
