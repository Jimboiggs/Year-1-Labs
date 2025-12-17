#include <stdio.h>

int main (void)
{
    int n;
    int i;
    
    scanf("%i", &n);
    
    for (i = 1; i <= n; i++)
    {
        printf("1/%i + ", i);
    }
    printf("...\n");
    
    return 0;
}