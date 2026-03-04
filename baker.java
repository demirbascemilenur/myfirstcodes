import java.util.Scanner;

public class baker {
    public static void main(String[] args) {
     /*Ekmeği 5 TL, poğaçayı 7,5TL, simidi 5 TL 'den satan bir fırıncı kazancının %18'i vergi vermektedir. Fırıncının sattığı ürün sayısı ürün çeşitlerine göre 
    klavyeden girildikten sonra fırıncının kazancı ve ödemesi gereken vergi hesaplayıp bu bilgileri ekrana yazdıran programın kodlarını yazınız.*/

    Scanner giris = new Scanner(System.in);

    System.out.println("Satilan simit sayisini girin: ");
      int simit = giris.nextInt();

    System.out.println("Satilan ekmek sayisini girin: ");
      int ekmek = giris.nextInt();

    System.out.println("Satilan pogaca sayisini girin: ");
      int pogaca = giris.nextInt();

    double kazanc = ekmek*5 + pogaca*7.5 + simit*5;
    System.out.println("Satis sonunda kazanc tutari: " + kazanc);

    double vergi  = kazanc*18/100;
    System.out.println("Odenmesi gereken vergi tutari: " + vergi);

    giris.close();


        

    }

}
