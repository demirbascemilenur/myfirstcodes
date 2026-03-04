#include <stdio.h>
//Hesap Makinesi: +, -, *, / karakterine göre işlem yapar.

int main(){
	int a, b;
	float sonuc;
	char islem;
	printf("Hesap Makinesi uygulamamiza hos geldiniz. \n");
	printf("Lutfen ilk sayiyi giriniz: ");
	scanf("%d",&a);
	
	printf("Lutfen ikinci sayiyi giriniz: ");
	scanf("%d",&b);
	
	printf("Lutfen yapmak istediginiz islemi seciniz.");
	printf("\n Toplama icin: + \t Cikarma icin: - \n Carpma icin: *  \t Bolme icin: / \n\n");
	scanf(" %c",&islem);
	
	switch (islem){
		case '+':
			sonuc = a+b;
			printf("Islem Sonucunuz: %.2f", sonuc);
			break;
		case '-':
			sonuc = a-b;
			printf("Islem Sonucunuz: %.2f", sonuc);
			break;
		case '/':
			sonuc = a/b;
			printf("Islem Sonucunuz: %.2f", sonuc);
			break;
		case '*':
			sonuc = a*b;
			printf("Islem Sonucunuz: %.2f", sonuc);
			break;
	}
	return 0;
	
}