import java.util.Scanner;

public class hesaplama_v2 {
    public static void main(String[] args) {
         /*İki sayı arasında dört işlemden (toplama, çıkarma, çarpma, bölme) birini yapan bir program yazılması istenmektedir. 
        Programın çalışma şekli şu şekilde olmalıdır; ilk önce iki sayının veri girişi yapılacak daha sonra ise kullanıcı 
        hangi matematiksel işlemi yapmak istiyorsa o işlemin operatörünü bir karakter olarak klavyeden girecek. İki sayı 
        kullanıcının girdiği matematik operatörüne göre hesaplamasını yapıp sonucu ekrana yazdıracaktır. Bu işlemi yapan program,
        ( toplama için +, çıkarma için -, çarpma için *, bölme için / veri girişi olduğunu varsayınız.)*/


        Scanner giris=new Scanner(System.in);

        double sayiBir,sayiIki;
        String islem;  // String veri tipi kullandım.
        System.out.println("Birinci sayiyi girin: ");
        sayiBir = giris.nextInt();
        System.out.println("İkinci sayiyi girin: ");
        sayiIki = giris.nextInt();

        System.out.println("Yapilacak islemin sembolunu yazin: ");
        islem = giris.next();
        
        if(islem.equals("+")) System.out.println("Sonuc: " + (sayiBir + sayiIki));
        else if(islem.equals("-")) System.out.println("Sonuc: " + (sayiBir - sayiIki));
         

        else if(islem.equals("*")) System.out.println("Sonuc: " + sayiBir * sayiIki);
        else System.out.println("Sonuc: " + sayiBir / sayiIki);

        giris.close();



    
    }
   
}
