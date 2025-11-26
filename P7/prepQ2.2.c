#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main() {
    char array1[] = {"Southampton"};
    char array2[] = {"London"};
    char array3[] = {"Liverpool"};

    bool x = true;
    bool y = false;
    if (strcmp(array2, array3) == 0)
    {
    printf("%i\n", x);
    }
    else
    {
    printf("%i\n", y);
    }

    printf("Press Enter to exit...");
    getchar();

    return 0;
}
