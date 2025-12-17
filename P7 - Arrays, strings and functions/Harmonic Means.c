#include <stdio.h>

double harmonicmean (int size, int array[]) {
    int i;
    double sum = 0;
    double mean;

    for (i = 0; i < size; i++)
    {
        sum += (1.0 / array[i]);
    }
    mean = sum / size;
    mean = 1 / mean;
    return mean;
}

double arraycompare (int size1, int size2, int array1[], int array2[]){
    
    if (harmonicmean(size1, array1) > harmonicmean(size2, array2))
    {
        return(harmonicmean(size1, array1));
    }
    else
    {
        return(harmonicmean(size2, array2));
    }

}