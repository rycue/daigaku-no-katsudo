#include <stdio.h>

int main() {
    int number = 0;
    printf("Enter a number for repetition: ");

    if (scanf("%d", &number) != 1) {
        printf("Invalid input");
        return 1;
    }

    for (int i = 0; i < number; i++) {
        printf("%d. %d\n", i+1, number);
    }

    return 0;
}