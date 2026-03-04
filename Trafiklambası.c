//Belirli sürelerle kırmızı,yeşil ve sarı ışık arasında geçiş yapar.
# include <stdio.h>
int main(){
        char renk='k';
        while(1){
        
        switch(renk){
          case 'k':
             printf("Kirmizi ışık, lutfen durun.\n");
             break;
          case 's' :
              printf("Sari isik, lutfen gecmeye hazırlanin\n"); 
              break; 
          case 'y':
             printf("Yesil isik, lutfen devam edin\n"); 
             break;
        }
        
        
        if(renk=='k'){
        sleep(5);
        renk='s';
        }
        else if(renk=='s'){
        sleep(1);
        renk='y';
        }
         else{
         sleep(3);
         renk='k';
         }    
               
        }
        
         
        



      return 0;
}
     