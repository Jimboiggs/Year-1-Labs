#include <stdio.h>
#include <string.h>

double minfunction (int size, double list[]) {
    double min = 9999999;
    int i;

    for (i = 1; i < size; i++)
    {
        if (list[i] < min)
        {
            min = list[i];
        }
    }

    return min;
}