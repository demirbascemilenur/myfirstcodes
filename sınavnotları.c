//Belli bir not dizisi var, sınavdan kalanların sayısını ve notların ortalamasını bulur ve sınav notları ile birlikte yazar.

#include <stdio.h>
int main(){
  int sayi=0;
  float toplam=0;
  int i;
  int not[10]={5,10,15,20,25,30,35,40,45,50};
  int *pd=not;
  
  
  for(i=0;i<10;i++){
  printf("%d. kisinin notu: %d\n",i+1,*pd);
  pd++;
  }
  pd=not;
  for(i=0;i<10;i++){
  if(*pd<35){
  sayi++;
  }
  toplam=toplam+*pd;
  pd++;
  }
   toplam=toplam/10;
   printf("%d kisi sinavdan kaldi\n",sayi);
   printf("%f sinav ortalamasidir. \n",toplam);
   
	return 0;
}


