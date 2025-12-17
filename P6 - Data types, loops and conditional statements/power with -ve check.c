#include <stdio.h>
#include <math.h>

int main(void)
{
    long long int n;
    int i;
    long long int result;

    scanf("%lli", &n);
    if (n < 0)
    {
        while (n < 0)
        {
            printf("Please enter a non-negative number\n");
            scanf("%lli", &n);
        }
    }

    for (i = 0; i <= n; ++i)
    {
        result = (long long int)pow(2, i);
        printf("%lli\n", result);
    }
    
}