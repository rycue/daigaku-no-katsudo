#include <stdio.h>

int main() {
    char letter;

    printf("Enter a letter: ");
    scanf("%c", &letter);

    switch (letter) {
        case 'A':
        case 'a':
            printf("The letter is A\n");
            break;
        case 'B':
        case 'b': 
            printf("The letter is B\n");
            break;
        default:
            printf("The letter is unknown.\n");
    }

    return 0;
}