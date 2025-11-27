#include <stdio.h>

double sum3(double x, double y, double z) {
    return x + y + z;
}

double product3(double x, double y, double z) {
    return x * y * z;
}

double divide3(double x, double y, double z) {
    if (y == 0 || z == 0) {
        printf("Cannot divide by 0\n");
        return 0.0;
    }
    return x / (y * z);
}

int main() {
    double a = 12.0, b = 2.0, c = 3.0;

    printf("Sum: %f\n", sum3(a, b, c));
    printf("Product: %f\n", product3(a, b, c));
    printf("Division: %f\n", divide3(a, b, c));

    return 0;
}
