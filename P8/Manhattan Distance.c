#include <stdio.h>
#include <math.h>
#include <stdlib.h>

double *space (int n)
{
    double *numbers = malloc(n * sizeof(double));
    int i;
    double num;

    for (i = 0; i < n; i++)
    {
        scanf("%lf", &num);
        numbers[i] = num;
    }
    return numbers;
}

double manhattan (double *point1, double *point2, int n)
{
    int i;
    double distance = 0;

    for (i = 0; i < n; i++)
    {
        distance += fabs(point1[i] - point2[i]);
    }

    return distance;
}