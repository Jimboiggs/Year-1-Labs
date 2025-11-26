#include <stdio.h>
#include <string.h>

int main() {
    char array1[] = {"Southampton"};
    char array2[] = {"London"};
    char array3[] = {"Liverpool"};

    printf("%zu\n", strlen(array1) + strlen(array2) + strlen(array3));
    printf("Press Enter to exit...");
    getchar();

    return 0;
}
