#include <stdio.h>

int main() {
    char letter;
    printf("Enter a letter: ");
    scanf("%c", &letter);

    if (letter == 'B' || letter == 'b') {
        printf("Your color is BLUE\n");
    } else if (letter == 'R' || letter == 'r') {
        printf("Your color is RED\n");
    } else if (letter == 'G' || letter == 'g') {
        printf("Your color is GREEN\n");
    } else if (letter == 'Y' || letter == 'y') {
        printf("Your color is YELLOW\n");
    } else {
        printf("The color for that letter is unknown.\n");
    }
}