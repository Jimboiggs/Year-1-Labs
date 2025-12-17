#include <stdio.h>
#include <string.h>

int stringconversion (int mainSize, int stringSize, unsigned long int sizeArray[mainSize], char arrayInput[mainSize][stringSize]){
    int i;

    for (i = 0; i < mainSize; i++)
    {
        sizeArray[i] = strlen(arrayInput[i]);
        printf("%li\n", sizeArray[i]);
    }

    return 0;
}