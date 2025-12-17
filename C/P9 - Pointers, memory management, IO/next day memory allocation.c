#include <stdio.h>
#include <stdlib.h>

struct date
{
    int day;
    int month;
    int year;
};

int leap(int year)
{
    if (year % 400 == 0)
        return 1;
    else if (year % 100 == 0)
        return 0;
    else if (year % 4 == 0)
        return 1;
    else
        return 0;
}

int count(int month, int year)
{
    if (month == 2)
    {
        if (leap(year))
            return 29;
        else
            return 28;
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
        return 30;
    }
    else
    {
        return 31;
    }
}

struct date *next_day (struct date *test_date)
{
    struct date *new_date = malloc(sizeof(struct date));
    *new_date = *test_date;
    new_date->day += 1;
    
    if (new_date->day > count(new_date->month, new_date->year))
    {
        new_date->day -= count(new_date->month, new_date->year);
        new_date->month += 1;
    }
    if (new_date->month > 12)
    {
        new_date->month -= 12;
        new_date->year += 1;
    }

    return new_date;
}