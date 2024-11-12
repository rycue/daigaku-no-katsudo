#include <stdio.h>
void printDayOfWeek(int day) {
    switch (day) {
        case 1:
            printf("Monday");
            break;
        case 2:
            printf("Tuesday");
            break;
        case 3:
            printf("Wednesday");
            break;
        case 4:
            printf("Thursday");
            break;
        case 5:
            printf("Friday");
            break;
        case 6:
            printf("Saturday");
            break;
        case 7:
            printf("Sunday");
            break;
    }

    printf("\n\n");
}

int main() {
    int dayOfWeek;

    while (1) {
        printf("Enter a number (1-7): ");
        
        if (scanf("%d", &dayOfWeek) != 1) {
            printf("Invalid input. Please enter a number.\n\n");
            // Clear the input buffer to avoid issues with subsequent inputs
            int c;
            while ((c = getchar()) != '\n' && c != EOF);
            continue;
        }

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            printf("Invalid Input. Please enter a number between 1 and 7.\n\n");
            // Clear the input buffer to avoid issues with subsequent inputs
            int c;
            while ((c = getchar()) != '\n' && c != EOF);
            continue;
        }

        printDayOfWeek(dayOfWeek);
    }

    printf("\n\n");

    return 0;
}