#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
    int n = 1;
    scanf("%i", &n);
    double x;
    int i;

    int y;
    float z;

    for (i = 1; i <= n; i++)
    {
        scanf("%lf", &x);
        x = fabs(x);
        y = (int) x;
        z = x - y;
        printf("%i\n", y);
        printf("%f\n", z);

    }

    return 0;
}