#include <stdio.h>

int main() {
    char secim;

    for(int i = 0; i < 3; i++) {
        printf("Almak istediginiz kahveyi bas harfiyle belirtiniz (e: Espresso, l: Latte, f: Filtre): ");
        scanf(" %c", &secim);  // Başına boşluk ekledik
        switch(secim) {
            case 'e': printf("Espresso hazırlanıyor...\n"); break;
            case 'l': printf("Latte hazırlanıyor...\n"); break;
            case 'f': printf("Filtre kahve hazırlanıyor...\n"); break;
            default: printf("Geçersiz seçim!\n"); i--; break; // hatalı seçim için turu tekrarla
        }
    }

    return 0;
}