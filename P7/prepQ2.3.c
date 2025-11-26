#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main() {
    char array1[] = {"Southampton"};
    char array2[] = {"London"};
    char array3[] = {"Liverpool"};

    bool i = true;
    bool j = false;
    if (array1[2] < array3[2])
    {
    printf("%i\n", i);
    }
    else
    {
    printf("%i\n", j);
    }


    printf("Press Enter to exit...");
    getchar();

    return 0;
}
