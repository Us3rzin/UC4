#include <stdio.h>

int main ()
{
int i = 0, cont = 0, array[5];

do
{
cont++;
array[i] = cont;
printf("vetor posicao: %d \n valor: %d\n",i,cont);
i++;
}
while (i<10);
}