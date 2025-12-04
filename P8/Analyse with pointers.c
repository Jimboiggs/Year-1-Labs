#include <stdio.h>

int analyse(double *prod , double *sum, double d1, double d2)
{
    *prod =  floor(d1) * floor(d2);
    *sum = floor(d1) + floor(d2);

    if (*prod == 0.0)
    {
        *prod = 0.0;
    }
    if (*sum  == 0.0)
    {
        *sum  = 0.0;
    }

    if ((d1 == 0 && d2 != 0) || (d2 == 0 && d1 != 0))
    {
        return -1;
    }
    else if ((d1 < 0 && d2 > 0) || (d2 < 0 && d1 > 0))
    {
        return -1;
    }
    else
    {
        return 1;
    }
   
}