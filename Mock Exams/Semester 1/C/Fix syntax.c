#include <stdlib.h>
#include <stdio.h>
int main(void)
{
    int x;
    float y = 1.2;
    scanf("%i", &x);
    int *p = &x;
    float *q = &y;
    printf("%0.2f", *p + *q);
    return 0;
}