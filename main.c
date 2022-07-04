#include <stdio.h>


int main()
{

    int N, Nmenores;
    double soma, media, percentual;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);

    char nomes[N][80];
    int idades[N];
    double alturas[N];

    for (int i = 0; i < N; i++) {
        printf("Dados da %da pessoa:\n", i + 1);
        printf("Nome: ");
        fseek(stdin, 0, SEEK_END);
        gets(nomes[i]);
        printf("Idade: ");
        scanf("%d", &idades[i]);
        printf("Altura: ");
        scanf("%lf", &alturas[i]);
    }

    soma = 0;
    for (int i = 0; i < N; i++) {
        soma = soma + alturas[i];
    }
    media = soma / N;
    printf("\nAltura media: %.2lf\n", media);

    Nmenores = 0;
    for (int i = 0; i < N; i++) {
         if (idades[i] < 16) {
            Nmenores = Nmenores + 1;
         }
    }

    percentual = (double) Nmenores * 100 / N;
    printf("Pessoas com menos de 16 anos: %.1lf %%\n", percentual);

    for (int i = 0; i < N; i++) {
         if (idades[i] < 16) {
             printf("%s\n", nomes[i]);
         }
    }


    return 0;
}
