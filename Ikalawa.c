#include <stdio.h>
#include <string.h>

int main() {
    char name[30];
    printf("\n\nEnter your name: ");
    fgets(name, sizeof(name), stdin);
    printf("Hello %s! Kamusta ka na par~!\n\n", name);
    return 0;
}