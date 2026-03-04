import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
    //Klavyeden iki dik kenarı girilen üçgenin hipotenüsünü hesaplayan programı yazınız.
    
    Scanner giris = new Scanner(System.in);

    System.out.println("İlk dik kenar uzunlugunu girin: ");
    int kenarBir = giris.nextInt();

    System.out.println("İlk dik kenar uzunlugunu girin: ");
    int kenarIki = giris.nextInt();

    double hipotenus = Math.sqrt(kenarBir*kenarBir + kenarIki*kenarIki);

    System.out.println("Hipotenus uzunlugu: " + hipotenus );
    giris.close();
    }
  
}
