#include <stdio.h>

int matrixproduct (int rows1, int columns1, int rows2, int columns2, int matrix1[rows1][columns1], int matrix2[rows2][columns2])
{
    int output[rows1][columns2];
    int i;
    int j;
    int line[columns2]; 

    if (rows1 < 1 || rows2 < 1 || columns1 != rows2)
    {
        printf("Invalid arguments\n");
    }
    else
    {
        for (i = 0; i < columns1; i++)
        {
            for (j = 0; j < columns2; j++)
            {
                line[j] = matrix1[i][j] * matrix2[j][j];
            }
            output[i] = line;
        }
    }
}