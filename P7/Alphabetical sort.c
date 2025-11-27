#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int stringsort (int arraySize, int stringSize, char array[arraySize][stringSize])
{
    int i = 0;
    int j = 0;
    int count = 0;
    char temp[1][20];

    bool sorted = false;

    while (!sorted)
    {
        i = 0;
        count = 0;
        for (i = 0; i < arraySize - 1; i++)
        {
            if (strcmp(array[i], array[i+1]) > 0)
            {
                strcpy(temp[0], array[i]);
                strcpy(array[i], array[i+1]);
                strcpy(array[i+1], temp[0]);
                count += 1;
            }
        }
        if (count == 0)
        {
            sorted = true;
        }
    }
    for (j = 0; j < arraySize; j++)
    {
        printf("%s\n", array[j]);
    }

    return 0;
}