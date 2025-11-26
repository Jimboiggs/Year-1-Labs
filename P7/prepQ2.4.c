#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main() {
    char array1[] = {"Southampton"};
    char array2[] = {"London"};
    char array3[] = {"Liverpool"};

    printf("%s\n", strcpy(array3, array2));

    printf("Press Enter to exit...");
    getchar();

    return 0;
}
