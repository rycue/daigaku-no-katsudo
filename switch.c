#include <stdio.h>

typedef enum {
    January = 1,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
} Month;

int main() {
    int monthNumber;

    printf("Enter a month (1-12): ");
    scanf("%d", &monthNumber);

    switch (monthNumber) {
        case January:
            printf("January\n");
            break;
        case February:
            printf("February\n");
            break;
        case March:
            printf("March\n");
            break;
        case April:
            printf("April\n");
            break;
        case May:
            printf("May\n");
            break;
        case June:
            printf("June\n");
            break;
        case July:
            printf("July\n");
            break;
        case August:
            printf("August\n");
            break;
        case September:
            printf("September\n");
            break;
        case October:
            printf("October\n");
            break;
        case November:
            printf("November\n");
            break;
        case December:
            printf("December\n");
            break;
        default:
            printf("Invalid month\n");
            break;
    }

    return 0;
}