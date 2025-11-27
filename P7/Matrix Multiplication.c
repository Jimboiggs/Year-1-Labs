#include <stdio.h>
#include <string.h>

int matrixproduct (int rows1, int columns1, int rows2, int columns2, int matrix1[rows1][columns1], int matrix2[rows2][columns2])
{
    long int output[rows1][columns2];
    int i;
    int j;
    int k;
    int x;
    int y;
    long int line[columns2]; 

    if (rows1 < 1 || rows2 < 1 || columns1 < 1 || columns2 < 1 || columns1 != rows2)
    {
        printf("Invalid arguments\n");
    }
    else
    {
        for (i = 0; i < rows1; i++)
        {
            for (j = 0; j < columns2; j++)
            {
                int sum = 0;
                for (k = 0; k < columns1; k++)
                {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                line[j] = sum;
            }
            

            for (j = 0; j < columns2; j++)
            {
                output[i][j] = line[j];
            }

        }

        for (y = 0; y < rows1; y++)
        {
            for (x = 0; x < columns2; x++)
            {
                printf("%4li", output[y][x]);
            }
            printf("\n");
        }
    }
    return 0;
}