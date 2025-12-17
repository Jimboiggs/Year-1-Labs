#include <stdio.h>

int main(void)
{
    float x, y;

    scanf("%f %f", &x, &y);
    
    if (x >= y)
    {
        printf("max(%.2f, %.2f) = %.2f", x, y, x);
    }
    else
    {
        printf("max(%.2f, %.2f) = %.2f", x, y, y);
    }

    return 0;
}
