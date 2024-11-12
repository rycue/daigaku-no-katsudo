#include <stdio.h>

int main() {
    int number;

    printf("Enter a number: ");
    scanf("%d", &number);

    switch (number) {
        case 1:
        case 2:
            printf("THE NUMBER IS %d", number);
            break;
        case 3:
        case 4:
            printf("THE NUMBER IS %d", number);
            break;
    }
    return 0;
}