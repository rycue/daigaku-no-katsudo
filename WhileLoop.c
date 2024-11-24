#include <stdio.h>
#include <stdbool.h>
int main() {
    // VARIABLES
    bool kumainKaNaBa = false;
    int response = 0;

    while (!kumainKaNaBa) {
        printf("\nKumain ka na ba?\n");
        printf("1. Yes\n2. No\n");
        printf("Response: ");

        if (scanf("%d", &response) != 1) {
            printf("Invalid input\n");
            return 1;
        }
        else {
            if (response == 1) {
                kumainKaNaBa = true;
                printf("\nSige.\n");
            }
            else if (response == 2) printf("\nTara kain tayo!\n");
        }
        
    }

    return 0;
}