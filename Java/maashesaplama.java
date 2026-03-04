import java.util.Scanner;

public class maashesaplama {
    public static void main(String[] args) {
        /*Bir çalışanın brüt maaşı çalıştığı saate göre hesaplanmaktadır. Çalıştığı her saat için 100TL ücret almaktadır.Brüt maaşın %15'i sigorta primi için ve 
        brüt maaşın %10'u devlete vergi olarak ayrılmaktadır.Buna göre çalışanın saat bilgisi klavyeden girildikten sonra alacağı net maaşı hesaplayan ve ekrana brüt
        maaşı, sigorta primi, vergi ve net maaş bilgilerini yazan programı yazınız*/

        Scanner giris = new Scanner(System.in);

        System.out.println("Calisanin calisma saatini girin: ");
        double calismaSaati = giris.nextDouble();

        double brut = calismaSaati*100;
        double sigortaPrimi = brut*15/100;
        double vergi = brut*10/100;
        double net = brut - (brut*15/100 + brut*10/100);

        System.out.println( "Calisanin brut maasi: " + brut);
        System.out.println("Sigorta primi tutari:  " + sigortaPrimi);
        System.out.println("Vergi tutari:  " + vergi);
        System.out.println("Calisanin net maasi: " + net);

        giris.close();
    }

}
