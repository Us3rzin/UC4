#include <stdio.h>

int main ()
{
int i=0;
int cont = 0, array[10];
array [6] = 11;

do
{
cont++;
array[i] = cont;
printf("vetor posicao: %d \n valor: %d\n",i,cont);
i++;
}

while (i<10);

printf("C e lesado por acaso?");

return 0;

}
//