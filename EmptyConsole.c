#include <stdio.h>

int main() {
    int number;
    
    printf("Enter a number: ");
    scanf("%d", &number);
    printf("\033[2J\033[1;1H");
    printf("You entered: %d", number);
    
    return 0;
}
