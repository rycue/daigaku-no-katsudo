#include <stdio.h>

int main() {

    char value[30];
    while (1) {
        printf("Enter DOG to exit: ");
        scanf("%s", &value);

        if (value == "dog")
            printf("TRUE");
    }
    return 0;
}