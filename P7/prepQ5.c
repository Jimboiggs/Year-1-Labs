#include <stdio.h>

// Define functions at start
float function1 (float var1);
float function2 (float var1);
float function3 (float var1);
float function4 (float var1);
float function5 (float var1);

float function1 (float var1)
{
    return var1 * function2 (var1);
}

float function2 (float var1)
{
    return var1 * function3 (var1);
}

float function3 (float var1)
{
    return var1 * function4(var1);
}

float function4 (float var1)
{
    return var1 * function5(var1);
}

float function5 (float var1)
{
    return var1 * var1;
}


int main(void)
{
    float newvar;
    
    scanf("%f", &newvar);

    printf("%f\n", function1(newvar));
    printf("%f\n", function2(newvar));
    printf("%f\n", function3(newvar));
    printf("%f\n", function4(newvar));
    printf("%f\n", function5(newvar));

    return 0;
    
}