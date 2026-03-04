//Metindeki tüm "i" ve "I" harflerini "*" yapar.


#include <stdio.h>
int main(){
  int i;
  char metin[100]="It is a sunny morning. I sit outside and drink my coffee. I feel calm and enjoy the quiet moment.";
  char *pd=metin;
  
  while(*pd!='\0'){
  if(*pd=='i' || *pd=='I'){
  *pd='*';
  }
  pd++;
  }
  
  printf("%s",metin);
}

