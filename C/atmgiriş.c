/*Kullanıcıdan bir "bakiye" ve "çekilmek istenen tutar" ister.Eğer çekilmek istenen tutar bakiyeden fazlaysa "Yetersiz Bakiye" 
yazar.Eğer tutar bakiyeden azsa ama bakiye 100 TL'nin altına düşecekse "Dikkat, bakiyeniz kritik seviyeye düşecek, onaylıyor 
musunuz? (1: Evet, 0: Hayır)" diye sorar.Onay verilirse parayı düşer, verilmezse işlem iptal edilir.*/

#include<stdio.h>
int main()
{
	int bakiye,tutar,secim;
	printf("Bakiyenizi giriniz: \n");
	scanf("%d",&bakiye);
	
	printf("Cekmek istediginiz tutari giriniz: \n");
	scanf("%d",&tutar);
	
	if(tutar>bakiye) {
		printf("Yetersiz bakiye!\n");
	}
		
	else if(tutar<bakiye && bakiye-tutar<100) {
		printf("Dikkat!Bakiyeniz kritik seviyeye dusecek,onayliyor musunuz?\n(1:Evet,0:Hayir)\n : ");
		scanf("%d",&secim);	
		if(secim==1) {
			bakiye-tutar;
			printf("Kalan bakiye %d\n iyi gunler!",bakiye-tutar);
	    }
	    else {
			printf("Isleminiz iptal edildi \n Iyi gunler!\n");
		}
   }
	else {
        printf("Kalan bakiye: %d\n Iyi gunler!", bakiye - tutar);
    }
    return 0;
}



   
