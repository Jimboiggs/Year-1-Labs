#include <stdio.h>

int main(void)
{
    int n;
    int i;
    int j;

    int m1;
    int m2;
    int m3;
    int m4;

    float sum;
    float average;

    int fails = 0;
    int passes = 0;
    int merits = 0;
    int distinctions = 0;

    double avgSum = 0.0;
    double avgAvg = 0.0; 

    printf("Enter the number of students\n");
    scanf("%i", &n);
    
    for (i = 1; i <= n; i++)
    {
        printf("Enter the marks for Student #%i\n", i);
        scanf("%i %i %i %i", &m1, &m2, &m3, &m4);
        sum = m1 + m2 + m3 + m4;
        average = sum / 4;
        avgSum += average;
        printf("The average for Student #%i is %.2f\n", i, average);

        int marks[] = {m1, m2, m3, m4};

        for (j = 0; j <= 3; j++)
        {
            if (marks[j] < 40)
            {
                fails += 1;
            }
            else if (marks[j] < 60)
            {
                passes += 1;
            }
            else if (marks[j] < 70)
            {
                merits += 1;
            }
            else if (marks[j] < 101)
            {
                distinctions += 1;
            }
        }
        
    }

    printf("The total number of distinctions is %i\n", distinctions);
    printf("The total number of merits is %i\n", merits);
    printf("The total number of passes is %i\n", passes);
    printf("The total number of fails is %i\n", fails);

    avgAvg = avgSum / n;
    
    printf("The overall average is %.2f\n", avgAvg);
    
}