#include <stdio.h>
#include <math.h>

struct point
{
    double x;
    double y;
};

struct point point1 = { 1.25, 3.15};
struct point point2 = { 0.65, 4.35};

double distance (struct point p, struct point q)
{
    double distance = 0;
    distance += pow(p.x - q.x, 2);
    distance += pow(p.y - q.y, 2);
    distance = sqrt(distance);

    return distance;
}